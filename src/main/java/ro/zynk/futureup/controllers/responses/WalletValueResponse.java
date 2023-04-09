package ro.zynk.futureup.controllers.responses;

public class WalletValueResponse extends BaseResponse{
    private Float value;

    public WalletValueResponse() {
    }

    public WalletValueResponse(Float value) {
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
