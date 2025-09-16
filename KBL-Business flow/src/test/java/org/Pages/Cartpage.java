package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class  Cartpage extends Ultilityclass {
	
	public Cartpage() {
		PageFactory.initElements(driver, this);
	}
     



      @FindBy(xpath="(//button[@class='action action-show'])[4]")
      private WebElement Termconditionlink;

     
      @FindBy(xpath="(//span[text()='Close'])[4]")
      private WebElement Termcloselink;

     
       public WebElement getTermcloselink() {
          return Termcloselink;
     }


       public WebElement getTermconditionlink() {
          return Termconditionlink;
     }


       @FindBy(xpath="//a[@class='order-number']")
      private WebElement SuccespageOrdernumber;


     public WebElement getSuccespageOrdernumber() {
          return SuccespageOrdernumber;
     }


     @FindBy(id="authorization-trigger")
      private WebElement LoginIcon2;

     public WebElement getLoginIcon2() {
          return LoginIcon2;
     }

     
     @FindBy(xpath="//a[@id='idR8YNIHUr']")
      private WebElement Myaccountlink;


     public WebElement getMyaccountlink() {
          return Myaccountlink;
     }

      @FindBy(xpath="//li[@class='nav item myorder']")
      private WebElement MyOrder1;

      public WebElement getMyOrder1() {
          return MyOrder1;
     }

       @FindBy(xpath="//tr//td[1]")
      private WebElement Ordernumber;


     public WebElement getOrdernumber() {
          return Ordernumber;
     }

     


      @FindBy(xpath="(//td[@class='col actions'])[1]")
      private WebElement Vieworder;


public WebElement getVieworder() {
          return Vieworder;
     }
      
     @FindBy(xpath="(//div[@class='product-item-details'])[2]")
     private WebElement Cartname;

     public WebElement getCartname() {
          return Cartname;
     }
    
    @FindBy(xpath="//button[@class='increaseQty']")
    private WebElement QtybuttoMaxCart;

    public WebElement getQtybuttoMaxCart() {
        return QtybuttoMaxCart;
    }

    @FindBy(xpath="(//span[@class='cart-price'])[1]")
    private WebElement Cartprice1;

    public WebElement getCartprice1() {
        return Cartprice1;
    }

    @FindBy(xpath="//button[@class='decreaseQty']")
    private WebElement QtybuttoMinCart;

    public WebElement getQtybuttoMinCart() {
        return QtybuttoMinCart;
    }

    @FindBy(xpath="//a[@class='action continue']")
    private WebElement CartcontinueButton;

    public WebElement getCartcontinueButton() {
       return CartcontinueButton;

    }
    
    @FindBy(xpath="(//span[@class='remove_class'])[2]")
    private WebElement Removebutton;

    public WebElement getRemoveButton() {
         return Removebutton;

    }

    @FindBy(xpath="(//a[@class='product-item-link'])[2]")
   private WebElement Cartname2;

   public WebElement getCartname2() {
       return Cartname2;
   }

    @FindBy(xpath="(//a[@class='product-item-link'])[4]")
   private WebElement Cartname4;

   public WebElement getCartname4() {
       return Cartname4;
   }

   @FindBy(xpath="//span[@class='counter qty']")
   private WebElement MinicartQty;

   public WebElement getMinicartQty() {
       return MinicartQty;
   }


   @FindBy(xpath="(//a[@class='use-ajax action towishlist action-towishlist Test_wish'])[1]")
   private WebElement AddToWishlistButton;

   public WebElement getAddToWishlistButton() {
       return AddToWishlistButton;
   }


   @FindBy(xpath="(//button[@title='Proceed to Checkout'])[2]")
   private WebElement CartCheckoutButton;

   public WebElement getCartCheckoutButton() {
       return CartCheckoutButton;
   }

   @FindBy(xpath=" //button[@class='action action-show-popup']")
   private WebElement AddnewAddressButton;

    public WebElement getAddnewAddressButton() {
         return AddnewAddressButton;
    }

    // checkout shipping address form

    @FindBy(xpath="(//input[@class='input-text'])[41]")
   private WebElement Firstname;

    public WebElement getFirstname() {
         return Firstname;
    }

    @FindBy(xpath="(//input[@class='input-text'])[42]")
   private WebElement Lastname;

    public WebElement getLastname() {
         return Lastname;
    }

    @FindBy(xpath="(//input[@class='input-text'])[43]")
   private WebElement Companyname;

    public WebElement getCompanyname() {
         return Companyname;
    }

    @FindBy(xpath="//input[@class='input-text pac-target-input']")
   private WebElement Streetaddress1;

    public WebElement getStreetaddress1() {
         return Streetaddress1;
    }

     @FindBy(xpath="(//input[@class='input-text'])[44]")
   private WebElement Streetaddress2;

    public WebElement getStreetaddress2() {
         return Streetaddress2;

    }

     @FindBy(xpath="(//input[@class='input-text'])[45]")
   private WebElement Streetaddress3;

    public WebElement getStreetaddress3() {
         return Streetaddress3;
    }



    
     @FindBy(xpath="(//input[@class='input-text'])[46]")
   private WebElement Zip;

    public WebElement getZip() {
         return Zip;
    }

    @FindBy(xpath="(//select[@class='select'])[15]")
    private WebElement Addresstype;

    public WebElement getAddresstype() {
         return Addresstype;
    }

    @FindBy(xpath="(//input[@class='input-text'])[50]")
    private WebElement Mobilenumber;
    
    
    public WebElement getMobilenumber() {
     return Mobilenumber;
}

    @FindBy(xpath="(//span[@class='price'])[1]")
    private WebElement preselectshipping;


    public WebElement getPreselectshipping() {
     return preselectshipping;
}




    @FindBy(xpath="//button[@class='action primary action-save-address']")
   private WebElement SaveAddressButton;

    public WebElement getSaveAddressButton() {
         return SaveAddressButton;
    }


     @FindBy(xpath="(//input[@name='billing-address-same-as-shipping'])[3]")
     private WebElement Billingaddress;


    public WebElement getBillingaddress() {
          return Billingaddress;
     }

     
     @FindBy(xpath=" //button[@class='show-more-btn']")
     private WebElement Showmoreoption;

     @FindBy(xpath="(//button[@class='action action-apply'])[4]")
     private WebElement Applybutton;

     @FindBy(xpath="(//button[@class='action action-cancel'])[4]")
     private WebElement Cancelbutton;


    public WebElement getShowmoreoption() {
          return Showmoreoption;
     }


     public WebElement getApplybutton() {
          return Applybutton;
     }


     public WebElement getCancelbutton() {
          return Cancelbutton;
     }


    @FindBy(xpath="(//input[@type='radio'])[4]")
   private WebElement PaymentButton;

    public WebElement getPaymentButton() {
         return PaymentButton;
    }

    
    @FindBy(xpath="(//input[@type='checkbox'])[10]")
   private WebElement Termcheckbox;



    public WebElement getTermcheckbox() {
         return Termcheckbox;
    }


     @FindBy(xpath="(//input[@type='checkbox'])[11]")
   private WebElement Termcheckboxlogin;



    public WebElement getTermcheckboxlogin() {
          return Termcheckboxlogin;
     }


    public WebElement getRemovebutton() {
     return Removebutton;
}


    @FindBy(xpath="(//button[@class='action primary checkout'])[4]")
    private WebElement Placeorder;
      

    public WebElement getPlaceorder() {
         return Placeorder;
    }

   // OrderSummary section

    @FindBy(xpath="(//table[@class='data table totals']//tr//td)[1]")
    private WebElement Cartsubtotal;


     @FindBy(xpath="(//table[@class='data table totals']//tr//td)[2]")
     private WebElement CARTIGST;
       
        public WebElement getCARTIGST() {
          return CARTIGST;
     }


        public WebElement getCartsubtotal() {
     return Cartsubtotal;
}


    public WebElement getCartSGSTtax() {
     return CartSGSTtax;
    }



   @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[3]")
   private WebElement CheckoutDiscount1;

   
   @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[5]")
   private WebElement CheckoutDiscount1Ordertotal;


   @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[1]")
   private WebElement Checkoutsubtotal;

   @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[2]")
   private WebElement checkoutIGST;

    

     @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[1]")
     private WebElement checkoutwithoutcoupon1;

     @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[2]")
     private WebElement checkoutwithoutcoupon2;

     @FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[4]")
     private WebElement checkoutwithoutcoupon4;

    
    public WebElement getCheckoutwithoutcoupon1() {
          return checkoutwithoutcoupon1;
     }


     public WebElement getCheckoutwithoutcoupon2() {
          return checkoutwithoutcoupon2;
     }


     public WebElement getCheckoutwithoutcoupon4() {
          return checkoutwithoutcoupon4;
     }


    public WebElement getCheckoutDiscount1Ordertotal() {
     return CheckoutDiscount1Ordertotal;
}


   public WebElement getCheckoutsubtotal() {
     return Checkoutsubtotal;
   }


   public WebElement getCheckoutIGST() {
     return checkoutIGST;
   }


   public WebElement getCheckoutDiscount1() {
     return CheckoutDiscount1;
}



   @FindBy(xpath="(//table[@class='data table totals']//tr//td)[2]")
   private WebElement CartSGSTtax;


     public WebElement getCartStax() {
          return CartSGSTtax;
     }

       @FindBy(xpath="(//table[@class='data table totals']//tr//td)[3]")
       private WebElement CartCGSTtax;
    

     public WebElement getCartCGSTtax() {
          return CartCGSTtax;
     }

     @FindBy(xpath="(//table[@class='data table totals']//tr//td)[5]")
      private WebElement CartOrderSummaryTotal;

     public WebElement getCartOrderSummaryTotal() {
          return CartOrderSummaryTotal;
     }

     @FindBy(xpath="(//table[@class='data table totals']//tr//td)[4]")
     private WebElement CARTIGSTORDERSUMMARYTOTAL;



     public WebElement getCARTIGSTORDERSUMMARYTOTAL() {
          return CARTIGSTORDERSUMMARYTOTAL;
     }




     @FindBy(xpath="(//button[@class='action action-select-shipping-item'])[1]")
      private WebElement Shippherebutton;

     public WebElement getShippherebutton() {
          return Shippherebutton;
     }



    

}



    

