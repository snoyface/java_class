class Rational
{
    // instance variables
    private int numerator;
    private int denominator;

    // define constructors
    public Rational (int n, int d)
    {
      /* Euclid's Algorithm for Computing the Greatest Common Divisor (GCD)
       *   given two integers, a and b, do the following:
       *   Step 1:  Divide a by b
       *   Step 2:  If the remainder above is == 0, you are done!
       *            the GCD is equal to b.  Stop!
       *   Step 3:  If the remainder is not equal to 0:
       *             replace the value of a by b
       *             replace the value of b by previous remainder
       *            Go back to step #1
       */
       int a = n;
       int b = d;
       // implement Euclid's Algorithm
       
       int remainder = a % b;
       while (remainder != 0)
       {
           a = b;
           b = remainder;
           remainder = a % b;
       }    
           
       /* alternatively
       while (a % b != 0)
       {
           int c = a % b;
           a = b;
           b = c;
        } 
        */     
           
       numerator = n / b;
       denominator = d / b;
    }

    public Rational (int n)
    {
       numerator = n;
       denominator = 1;
    }

    public Rational (Rational r)
    {
       numerator = r.numerator;
       denominator = r.denominator;
    }

    // Behavior (instance methods)
    public Rational mulRat (Rational multiplier)
    {
        int top = numerator * multiplier.numerator;
	int bottom = denominator * multiplier.denominator;
	return new Rational (top, bottom);
    }

    public Rational addRat (Rational addend)
    {
       int top = this.numerator * addend.denominator +
                 this.denominator * addend.numerator;
       int bottom = denominator * addend.denominator;
       return new Rational (top, bottom);
    }
    
    public String toString()
    {
       return numerator + " / " + denominator;
    }
 }   
