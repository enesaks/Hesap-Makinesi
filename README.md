# Hesap Makinesi

Nasıl çalıştığını gösteren ![video](https://user-images.githubusercontent.com/98012557/227785779-06f5b735-9f89-4945-a1ba-643ed18ba962.mp4)
 
 ![hesapmakinası](https://github.com/enesaks/Hesap-Makinesi/assets/98012557/4ba0a59e-8c84-4df6-8656-5b8911707d3e)
 
 
 [Bütün Kodlar](https://github.com/enesaks/Hesap-Makinesi/blob/main/app/src/main/java/com/example/enesaks/MainActivity.java)
# Hesap Makinesi Kodu 

Toplamaya basıldığında Çalışan Kod 


                case "+":
                char[] chrCevap = (HesapCevap.getText().toString()).toCharArray();
                if(HesapCevap.getText().toString().matches("") || chrCevap[chrCevap.length-1] == '+'|| chrCevap[chrCevap.length-1] == '-'|| chrCevap[chrCevap.length-1] == '/'|| chrCevap[chrCevap.length-1] == '*' ||    chrCevap[chrCevap.length-1] == '%'|| chrCevap[chrCevap.length-1] == ','){
                }else
                    temp1 = Double.parseDouble(HesapCevap.getText()+"");
                    HesapCozum.setText(HesapCevap.getText().toString()+"+");
                    HesapCevap.setText(null);
                    toplam = true;

                break;
                
Eşitire Basıtğımızda if else arasında toplama kısmının kodu 

                if (toplam == true){
                    HesapCevap.setText(temp1+temp2+"");
                    HesapCozum.setText(temp1+"+"+temp2);
                    toplam = false;
                }

