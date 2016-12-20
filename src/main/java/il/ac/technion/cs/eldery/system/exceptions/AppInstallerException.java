package il.ac.technion.cs.eldery.system.exceptions;

import il.ac.technion.cs.eldery.system.applications.SmartHouseApplication;

/** @author RON
 * @since 09-12-2016 */
public class AppInstallerException extends Exception {
    public enum ErrorCode {
        MORE_THAN_ONE_IMPL_ERROR(0, "There is more than one class that extends " + SmartHouseApplication.class.getName()),
        NO_IMPL_ERROR(1, "There is no class that extends " + SmartHouseApplication.class.getName()),
        INSTANTIATION_ERROR(2, "Can't create an instance of the class that extends " + SmartHouseApplication.class.getName()),
        ILLEGAL_ACCESS_ERROR(3, "The class that extends " + SmartHouseApplication.class.getName() + ", or its nullary constructor is not accessible");

        private final int id;
        private final String msg;

        ErrorCode(int id, String msg) {
            this.id = id;
            this.msg = msg;
        }

        public int getId() {
            return this.id;
        }

        public String getMsg() {
            return this.msg;
        }
    }

    private static final long serialVersionUID = 4633789134305606432L;

    private ErrorCode errorCode;
    private String moreInfo;

    public AppInstallerException(final ErrorCode errorCode) {
        this(errorCode, "");
    }

    public AppInstallerException(final ErrorCode errorCode, final String moreInfo) {
        super(errorCode.getMsg() + "; " + moreInfo);
        this.errorCode = errorCode;
        this.moreInfo = moreInfo;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
