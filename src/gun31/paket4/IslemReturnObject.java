package gun31.paket4;

public class IslemReturnObject {

    double val;


    // bu method return.this ile bu classdan olusturulan ilgili nesneyi return eder.
    // this = bu class"in nesnesidir
    public IslemReturnObject set(double val){
        this.val = val;
        return this;
    }

    public IslemReturnObject topla(double x){
        val += x;
        return this;
    }

    public IslemReturnObject cikar(double x){
        val -= x;
        return this;
    }
    public IslemReturnObject carp(double x){
        val*=x;
        return this;
    }

    public IslemReturnObject bol(double x){
        val/=x;
        return this;
    }
    public IslemReturnObject mod(double x){
        val%=x;
        return this;
    }
    public IslemReturnObject power(double x){
        val=Math.pow(val,x);
        return this;
    }
    public IslemReturnObject karekok(){
        val=Math.sqrt(val);
        return this;
    }
    public IslemReturnObject convertToInt(){
        val=(int)val;
        return this;
    }
    public IslemReturnObject floor(){
        val=Math.floor(val);
        return this;
    }
    public IslemReturnObject ceil(){
        val=Math.ceil(val);
        return this;
    }
    public IslemReturnObject round(){
        val=Math.round(val);
        return this;
    }

    public void yaz(){
        System.out.println("sonuc = " + val);
    }


    /*
        Ödev
        Bu class"a
        carpma, bolme, mod, power, karekök,
        convertToInt,
        Math.floor, Math.ceil, Math.round

     */

}
