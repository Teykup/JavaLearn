package Intellegent.StringBuilder_VarArgs;

public class String_Builder {


        /*
            1)String Class is "immutable" but StringBuilder Class is "mutable"
            2)"immutable" means updates will NOT be reflected to the original String without assignment
            3)"mutable" means updates will be reflected to the original String without assignment
            4)If you need to reflect updated directly to the original String, use StringBuilder Class, otherwise
              use String Class
         */

        public static void main(String[] args) {

            String s = "Ali";
            s.concat("!");
            System.out.println(s);

            System.out.println(s);
            System.out.println("s.concat(\"**\") = " + s.concat("**"));
            System.out.println(s + "!");
//---------------------------------------------------------------------------------------------------------------------
            //How to create a StringBuilder Object
            //1.Way:
            StringBuilder sb1 = new StringBuilder("Veli");
            System.out.println(sb1);//Veli

            //2.Way:
            StringBuilder sb2 = new StringBuilder();

            //Java gives 16 boxes for the characters whose numbers are less than or equal to 16
            System.out.println("For empty: " + sb2.capacity());
            //append=(tr) ekle
            sb2.append("Veli");
            sb2.append(" oğlu");
            System.out.println(sb2);
            System.out.println("sb2 length() = "+sb2.length());//9
            System.out.println("sb2.capacity() = " + sb2.capacity());//16

            sb2.append(" Han").append("!...").append("xxxx");
            System.out.println(sb2);//Veli oğlu Han!...xxxx
            System.out.println("sb2 length= " +sb2.length());// 21
            //Java gives 2 times existing boxes plus 2 if you use characters more than the existing boxes (mevcut*2)+2=34
            System.out.println("For non-empty: " + sb2.capacity());

            System.out.println(" ");
//LENGTH VE CAPACİTY
            //3.Way:
            StringBuilder sb3 = new StringBuilder(2);
            sb3.append("FL!");
            System.out.println("sb3 = " + sb3);
            System.out.println(sb3.length());//3
            System.out.println(sb3.capacity());//2*2+2 = 6
//LastIndexOf
            StringBuilder sb4 = new StringBuilder("Mississippi");
            System.out.println(sb4.lastIndexOf("s"));//6
            System.out.println(sb4.lastIndexOf("a"));//-1

            //Take the first 7 indexes, return the index of last occurrence of "s"
            System.out.println(sb4.lastIndexOf("s",7));//6
            System.out.println(sb4.lastIndexOf("s",5));//5
            System.out.println(sb4.lastIndexOf("a",7));//-1

            sb4.insert(2,"XXX");
            System.out.println(sb4);//MiXXXssissippi

            System.out.println(sb4.insert(1,"ABCDE", 1,2));// MBiXXXssissippi

            sb4.delete(4, 7);
            System.out.println(sb4);// MBiXsissippi

            sb4.deleteCharAt(1);
            sb4.deleteCharAt(1);
            System.out.println(sb4);// MXsissippi

            sb4.replace(2, 6, "S");
            System.out.println(sb4);// MXSssippi//MXSippi

            sb4.reverse();
            System.out.println(sb4);// ippissSXM

            StringBuilder sb5 = new StringBuilder("Ali Can");
            StringBuilder sb6 = new StringBuilder("Ali Can");
            StringBuilder sb7 = new StringBuilder("Dli Can");

            //For the same Strings compareTo() method returns 0
            System.out.println(sb5.compareTo(sb6));//0

            //If the first one comes before the second one the result will be negative
            System.out.println(sb5.compareTo(sb7));//-3

            //If the first one comes after the second one the result will be positive
            System.out.println(sb7.compareTo(sb5));//3

            //Note: The number 3 means the difference lexicographically
            //Note: For the uppercase and lowercase it will return the difference between ASCII values

            //Note: If a method comes from String Class, it will be immutable, it means it cannot update the String Builder
            String newString = sb5.substring(4);
            System.out.println(newString);// Can
            System.out.println(sb5);// Ali Can

            //Can we convert StringBuilders to String? Yes by using toString()
            String stringFromStringBuilder = sb5.toString();
            //Can we convert String to StringBuilders? Yes by using StringBuilder() constructor
            StringBuilder stringBuilderFromString = new StringBuilder(stringFromStringBuilder);
        }
    }

