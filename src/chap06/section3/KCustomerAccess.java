package chap06.section3;

public class KCustomerAccess {
    public static void main(String[] args){

        KJob kjob = KCustomer.JOB;
        System.out.println(kjob.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
