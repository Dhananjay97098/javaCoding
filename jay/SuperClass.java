package practices.java.jay;


import java.io.IOException;

class SuperClass
    {
        void anyMethod() throws IOException
        {
            System.out.println("Super Class Method");
        }
    }

    class SubClass extends SuperClass
    {
        @Override
        void anyMethod() throws IOException
        {
            System.out.println("Sub Class Method");
        }
    }

