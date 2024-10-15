public class TheInVoiceItemClass {
    String Id;
    String decs;
    int qty;
    double unitPrice;
    TheInVoiceItemClass(String Id, String decs, int qty, double unitPrice) {
        this.Id = Id;
        this.decs = decs;
        this.qty = qty;
        this.unitPrice = unitPrice;
    };
    String getId(){
        return Id;
    }
    String getDecs(){
        return decs;
    }
    int getQty(){
        return qty;
    }
    double getUnitPrice(){
        return unitPrice;
    }
    void setQty(int qty){
        this.qty = qty;
    }
    double getUniPrice(){
        return unitPrice;
    }
    void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    double getTotal(){
        return unitPrice * qty;
    }


}
