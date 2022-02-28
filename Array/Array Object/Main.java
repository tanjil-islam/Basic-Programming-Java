public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Tanjil");
        s1.setId("2132");
        s1.setDept("CSE");
        s1.setCgpa(3.30);
       s1.setPhone(1612757513);
        
        Student s2 = new Student();
        s2.setName("Sadik");
        s2.setId("5421");
        s2.setDept("CSE");
        s2.setCgpa(3.75);
        s2.setPhone(214865566);

        Student s3 = new Student();
        s3.setName("Momin");
        s3.setId("2546");
        s3.setDept("English");
        s3.setCgpa(3.37);
        s3.setPhone(175652222);

        Student information[] = new Student[5];

        information[0]=s1;
        information [1]=s2;
        information[3]=s3;

        for(int i=0; i<information.length; i++)
        {

            if(information[i]!=null)
            {
                System.out.println("Main [" +i +"] Name: "+information[i].getName());
                System.out.println("Main [" +i + "] ID: "+information[i].getId());
                System.out.println("Main [" +i+ "] Dept: "+information[i].getDept());
                System.out.println("Main ["+i+ "] Cgpa: "+information[i].getCgpa());
                System.out.println("Main [" +i+ "] Phone: "+information[i].getPhone());

               System.out.println("-----------------");
            }

            else
            {
                System.out.println("There is null Object in information[" + i + "]");
                System.out.println("-----------------");

            }

        }

    }

}