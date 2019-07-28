package items;

import features.Feature;

import java.util.Random;
import java.util.stream.IntStream;

public class ToyItem implements Item {

    private Feature featureOfToy;

    private String email;

    private String address;

    private String[] phoneNumber;

    public static void main(final String[] args) {
        final Random rand = new Random();

        IntStream.range(1, 100).forEach(in -> {
            System.out.println("args = [" + rand.nextInt(3) + "]");
        });
    }

    @Override
    public String getName() {
        final Random rand = new Random();

        final int index = rand.nextInt(4);
        return "email:" + email + ", address:" + address + " ." + phoneNumber[index];
    }

    @Override
    public String showFeatures(final Feature featureOfToy) {
        return featureOfToy.showInfos();
    }

    public void setPhoneNumber(final String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFeatureOfToy(final Feature featureOfToy) {
        this.featureOfToy = featureOfToy;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}
