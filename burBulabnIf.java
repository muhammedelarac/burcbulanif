import java.util.Scanner;
/**
 * burBulabnIf
 */
public class burBulabnIf {

    public static void main(String[] args) {
        int day,month;
        Scanner input = new Scanner(System.in);
        System.out.println( " Doğduğunuz Ay Seçin!");
        month= input.nextInt();
        
        if (month >=1 && month<=12){

        }else{
            System.out.println( " Hatalı Giriş Girdiniz!");

        }

        System.out.println( " Doğduğunuz Gün Seçin!");
        day=input.nextInt();
       
       
        if ( month ==  3  ){
            if( day>= 21 && day<=30){
                System.out.println( " Koç Burcu");
            }else if (day>= 1 && day<=20 ){
                System.out.println( " Balık Burcu");

            }else{
                System.out.println( " Hatalı Giriş Girdiniz!");

            }
        }else if(
            month== 4 ){
                if( day>= 1 && day<=20){
                    System.out.println( " Koç Burcu");
            }else if ( day>= 21 && day<=31) {
                System.out.println( " Boğa Burcu");

            }else{
                System.out.println( " Hatalı Giriş Girdiniz!");

            }

    }else if( month==5){
        if(day>=1 && day<=21)
        {
            System.out.println( "Boğa Burcu ");

        }else if (day>=22 && day<=30){
            System.out.println( " İkizler Burcu");
        }else{
            System.out.println( " Hatalı Giriş Girdiniz!");

        }
    }else if( month==6){
        if( day>=1 && day<=22){
            System.out.println( " İkizler Burcu");
        }else if( day>=23 && day<=30){
            System.out.println( " Yengeç  Burcu");

        }else{
            System.out.println( " Hatalı Giriş Girdiniz!");

    }


}else if( month==7) {

 if( day>=1 && day<=22){
    System.out.println( " Yengeç Burcu");
}else if( day>=23 && day<=30){
    System.out.println( "  Aslan   Burcu");

}else{
    System.out.println( " Hatalı Giriş Girdiniz!");

}


}else if( month==8) {

    if( day>=1 && day<=22){
       System.out.println( " Aslan Burcu");
   }else if( day>=23 && day<=31){
       System.out.println( "  Başak Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
   
   }




}else if( month==9) {

    if( day>=1 && day<=22){
       System.out.println( " Başak Burcu");
   }else if( day>=23 && day<=31){
       System.out.println( "  Terazi Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
   
   }




}else if( month==10) {

    if( day>=1 && day<=22){
       System.out.println( " Terazi Burcu");
   }else if( day>=23 && day<=30){
       System.out.println( "  Akrep Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
   
   }




}else if( month==11) {

    if( day>=1 && day<=22){
       System.out.println( " Akrep Burcu");
   }else if( day>=23 && day<=31){
       System.out.println( "  Yay Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
   
   }




}else if( month==12) {

    if( day>=1 && day<=22){
       System.out.println( " Yay Burcu");
   }else if( day>=23 && day<=31){
       System.out.println( "  Oğlak  Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
       

       }
   
   }else if( month==1) {

    if( day>=1 && day<=22){
       System.out.println( " Oğlak Burcu");
   }else if( day>=23 && day<=31){
       System.out.println( "  Kova Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
   
   }

}else if( month==2) {

    if( day>=1 && day<=19){
       System.out.println( " Kova Burcu");
   }else if( day>=20 && day<=28){
       System.out.println( "  Balık Burcu");
   
   }else{
       System.out.println( " Hatalı Giriş Girdiniz!");
   
   }

}



else{
    System.out.println( " Hatalı Giriş Girdiniz!"); 
}





}


}


