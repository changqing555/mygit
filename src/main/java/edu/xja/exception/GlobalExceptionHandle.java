package edu.xja.exception;

import edu.xja.vo.HttpResult;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义全局异常类
 * 全局异常控制类加入拦截
 * @author 25140
 */
@RestControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public HttpResult bindExceptionErrorHandler(BindException ex) throws Exception {
        List<String> errorList = new ArrayList<>();
        if (ex.hasErrors()) {
            List<ObjectError> list = ex.getAllErrors();
            for (ObjectError objectError : list) {
                errorList.add(objectError.getDefaultMessage());
            }
            //lambda 表达式写法，和上面的for循环一样
//            ex.getAllErrors().forEach( objectError -> errorList.add(objectError.getDefaultMessage()));
        }
        if (!errorList.isEmpty()) {
            return HttpResult.error(errorList);
        }
        return HttpResult.error();
    }

    // -----------------------Request------------------------------------------------
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public HttpResult handleMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return HttpResult.error("错误的请求方式");
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.OK)
    public HttpResult handleMissingParameterException(MissingServletRequestParameterException e) {
        return HttpResult.error("参数缺失");
    }

    // ----------------------------data--------------------------------------
    @ExceptionHandler(DataAccessException.class)
    @ResponseStatus(HttpStatus.OK)
    public HttpResult handlerDataAccessException(DataAccessException e) {
        return HttpResult.error(31000, "数据库异常");
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    @ResponseStatus(HttpStatus.OK)
    public HttpResult handleDataEmptyException(EmptyResultDataAccessException e) {
        return HttpResult.error("数据不存在");
    }

    @ExceptionHandler(DuplicateKeyException.class)
    @ResponseStatus(HttpStatus.OK)
    public HttpResult handleDataDualException(DuplicateKeyException e) {
        return HttpResult.error("数据重复插入");
    }

//    @ExceptionHandler(MultipartException.class)
//    @ResponseStatus(HttpStatus.OK)
//    public HttpResult handlerMultipartException(Throwable ex) {
//        String message = "文件上传错误";
//        MultipartException mEx = (MultipartException) ex;
//        if (ex.getCause() != null) {
//            Throwable cause = ex.getCause().getCause();
//            if (cause instanceof SizeLimitExceededException) {
//                SizeLimitExceededException flEx = (FileUploadBase.SizeLimitExceededException) cause;
//                float permittedSize = flEx.getPermittedSize() / 1024 / 1024;
//                message = "文件大小超过" + permittedSize + "MB";
//            } else if (cause instanceof FileSizeLimitExceededException) {
//                FileSizeLimitExceededException flEx = (FileSizeLimitExceededException) mEx.getCause().getCause();
//                float permittedSize = flEx.getPermittedSize() / 1024 / 1024;
//                message = "文件大小超过" + permittedSize + "MB";
//            }
//        }
//
//        return HttpResult.error(message);
//    }


    // ---------All--------------------------------
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.OK)
//    public HttpResult handlerException(Exception e) {
//        return HttpResult.error(30000, "系统异常");
//    }
}

