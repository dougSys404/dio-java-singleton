package subsystem.crm;

public class CrmService {

    private CrmService(){}

    public static void createCustomer(String name, String cep, String cidade, String estado){
        System.out.println("Successfully created customer on CRM System!");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
