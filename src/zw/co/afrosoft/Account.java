package zw.co.afrosoft;

public class Account {
    private int id;
    private String email;
    private Address address;
    private ContactDetails contactDetails;

    private Account(Builder builder){

    }
    public static class Builder{
        private int id;
        private String email;
        private Address address;
        private ContactDetails contactDetails;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder address(Address address){
            this.address = address;
            return this;
        }
        public Builder contactDetails(ContactDetails contactDetails){
            this.contactDetails = contactDetails;
            return this;
        }
    }
}
