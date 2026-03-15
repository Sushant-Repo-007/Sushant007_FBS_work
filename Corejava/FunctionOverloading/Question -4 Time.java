// Question 4: Time Addition Using Function Overloading

import java.util.Scanner;

class Time
{
    int hr, min, sec;   // attributes

    // Default constructor
    Time()
    {
        hr = 0;
        min = 0;
        sec = 0;
    }

    // Parameterized constructor
    Time(int hr, int min, int sec)
    {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalize();   // carry forward
    }

    // Setter methods
    void setTime(int hr, int min, int sec)
    {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalize();
    }

    // Add two Time objects
    Time add(Time t)
    {
        Time result = new Time();
        result.sec = this.sec + t.sec;
        result.min = this.min + t.min;
        result.hr  = this.hr  + t.hr;

        result.normalize();
        return result;
    }

    // Add hours
    Time add(int hours)
    {
        return new Time(this.hr + hours, this.min, this.sec);
    }

    // Add minutes
    Time addMinutes(int minutes)
    {
        return new Time(this.hr, this.min + minutes, this.sec);
    }

    // Add seconds
    Time addSeconds(int seconds)
    {
        return new Time(this.hr, this.min, this.sec + seconds);
    }

    // Carry forward logic
    void normalize()
    {
        if (sec >= 60)
        {
            min += sec / 60;
            sec = sec % 60;
        }

        if (min >= 60)
        {
            hr += min / 60;
            min = min % 60;
        }

        hr = hr % 24;   // 24-hour format
    }

    // Display method
    void display()
    {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}


// Test class
class TestTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Input for Time 1
        System.out.println("Enter hours for Time 1:");
        int hr1 = in.nextInt();

        System.out.println("Enter minutes for Time 1:");
        int min1 = in.nextInt();

        System.out.println("Enter seconds for Time 1:");
        int sec1 = in.nextInt();

        Time t1 = new Time(hr1, min1, sec1);

        // Input for Time 2
        System.out.println("Enter hours for Time 2:");
        int hr2 = in.nextInt();

        System.out.println("Enter minutes for Time 2:");
        int min2 = in.nextInt();

        System.out.println("Enter seconds for Time 2:");
        int sec2 = in.nextInt();

        Time t2 = new Time(hr2, min2, sec2);

        // Add two Time objects
        Time result = t1.add(t2);

        System.out.println("Result after adding two Time objects:");
        result.display();

        // Add integer values
        Time addHour = t1.add(5);
        System.out.println("After adding 5 hours:");
        addHour.display();

        Time addMin = t1.addMinutes(30);
        System.out.println("After adding 30 minutes:");
        addMin.display();

        Time addSec = t1.addSeconds(40);
        System.out.println("After adding 40 seconds:");
        addSec.display();

        in.close();
    }
}
