package gun2;

public class DataTypes1 {
    public static void main(String[] args) {
            /*
            Primitiv, non-Primitiv

    Data    Type    Size Description
    byte    1 byte  -128 to 127
    short   2 bytes -32,768 to 32,767
    int     4 bytes -2,147,483,648 ( −2^31 ) to 2,147,483,647 ( 2^31−1 )
    long    8 bytes  -9,223 ,372,036,854,775,808 ( −263 )to 9,223,372,036,854,775,807 (−263−1 )

    float   4 bytes 6 to 7 decimal digits
    double  8 bytes 15 decimal digits

    boolean 1 bit true or false
    char    2 bytes single character/letter or ASCII values
    String
    Java --> int, double

      */


            byte byteVar = 123;
            System.out.println(byteVar);
            //byte byteVar2 = 129; //olmaz byte -128 to 127 aralığında

            int intVar =123;
            System.out.println(intVar);
            int intVar2 =1;
            System.out.println(intVar2);

            long longvar1 = 123123123122L; // aralığı geçtiği için sonuna ifadeyi belirten harf koyduk

            System.out.println(longvar1);
            float floatVar =1.2121212121212121F;
            double doubleVar =1.2212121212121212;

            System.out.println(floatVar);
            System.out.println(doubleVar);


        }
}
