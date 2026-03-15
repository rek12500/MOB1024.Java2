package Lab1bai1;

public class ImportedProduct extends Product {

		    private double importTaxRate;
		    private double shippingFee;

		    public ImportedProduct(String id, String name, double basePrice,
		                           double importTaxRate, double shippingFee) {
		        super(id, name, basePrice);
		        this.importTaxRate = importTaxRate;
		        this.shippingFee = shippingFee;
		    }

		    public double getImportTaxRate() {
		        return importTaxRate;
		    }

		    public void setImportTaxRate(double importTaxRate) {
		        if(importTaxRate >= 0 && importTaxRate <= 1){
		            this.importTaxRate = importTaxRate;
		        }else{
		            System.out.println("Tax rate khong hop le");
		        }
		    }

		    public double getShippingFee() {
		        return shippingFee;
		    }

		    public void setShippingFee(double shippingFee) {
		        if(shippingFee >= 0){
		            this.shippingFee = shippingFee;
		        }else{
		            System.out.println("Shipping fee khong hop le");
		        }
		    }

		    @Override
		    public double finalPrice(){
		        return getBasePrice() + getBasePrice()*importTaxRate + shippingFee;
		    }
		    @Override
		    public String toString() {
		        return super.toString() + " ImportedProduct [importTaxRate=" 
		               + importTaxRate + ", shippingFee=" + shippingFee 
		               + ", finalPrice=" + finalPrice() + "]";
		    }
		}
