public class TestStudent{
        public static void main(String arggs[]){
                Configuration cf= new Configuration();
                cfg.configure("hibernate.cfg.xml");

                SessionFactory sf=cfg.BuildSessionFactory();
                Session s=sf.cfg.openSession();

                Transaction tx=s.beginTransaction();
                Student sobj =new Student();
                sobj.setid(200);
                sobj.setName("Raman");
                sobj.setAge(21);
                s.save(sobj);
                tx.commit();
                s.close();


        }
}