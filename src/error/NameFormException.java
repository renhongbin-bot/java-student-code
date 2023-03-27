package error;

public class NameFormException extends RuntimeException {
//    NameFormat: 异常当前名字格式化问题
//    Exception:表示为异常类
//    运行时:RuntimeException 核心 表示由于参数错误而导致的问题
//    编译时:Exception 核心  提醒程序员检查本地信息


    public NameFormException() {
    }

    public NameFormException(String message) {
        super(message);
    }
}
