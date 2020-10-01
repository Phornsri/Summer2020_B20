package Office_Hours.Practice_08_31_2020;

public class Static_VS_Instance {
    int insVariable;
    static int staticVariable;

    public static void main(String[] args) {
        System.out.println(staticVariable );
       // System.out.println(insVariable);// static only accepts static

       Static_VS_Instance  obj = new Static_VS_Instance();
        System.out.println(obj.insVariable);// 0
        System.out.println(Static_VS_Instance.staticVariable );
    }
    public void method1(){
        System.out.println(insVariable);
        System.out.println(staticVariable);
    }
}
