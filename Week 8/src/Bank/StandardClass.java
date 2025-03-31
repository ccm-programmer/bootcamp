package Bank;

public class StandardClass extends Account{
  private Long accountNumber;
  private Long couponNumber;

  public StandardClass (String firstName, String lastName, double balance, Long couponNumber){
    super (firstName, lastName, balance);
    this.couponNumber = 01;  
  }

    public Long getCouponNumber(){
      return this.couponNumber;
    }

    public void setCoupon (Long couponNumber){
      this.couponNumber = couponNumber;
    }

    @Override
    public String toString(){
      return super.toString() + " , couponNumber is: " + this.getCouponNumber();
    }

    @Override
    public String accountType() {
    return "StandardClass";
  }
}
