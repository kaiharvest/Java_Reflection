package indradwiprabowo.reflection.data;

import java.io.Serializable;

public class Data<T extends AutoCloseable & Serializable> {

    private T Data;

    public Data() {

    }

    public Data(T data) {
        Data = data;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

}
