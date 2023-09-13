package Lab6.Task1;

public class Dealership{

    // task 2 : clase interne
    private class BrandOffer implements Offer{

        @Override
        public int getDiscount(Car car) {
            return 0;
        }
    }
    private class DealerOffer implements Offer{

        @Override
        public int getDiscount(Car car) {
            return 0;
        }
    }
    private class SpecialOffer implements Offer{

        @Override
        public int getDiscount(Car car) {
            return 0;
        }
    }
    // task 2 : metoda getFinalPrice
    public float getFinalPrice(Car car){
        return 0;
    }

    // task 4:
    public void negociate (Car car, Offer offer){

    }



}
