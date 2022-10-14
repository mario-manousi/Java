class Mobile{
    double time;
    String kind;
    int sms;
    double Sub_Fixed;
    double Sub_Free;
    double payment;

    Mobile(String k, double t, double Sub_Fixed) {
        time = t;
        kind = k;
        Sub_Fixed = 12;
    }
        switch(kind)

    {
        case "fixed":
            if (time <= 60000)
                payment = 0;
            else if (time > 60000) ;
            payment = time * 0.02;
            break;
        return payment;
            if (sms >= 0) ;
                sms = sms * 0.08;
            break;
        return sms;
        case "free":
            if (time >= 1)
                payment = time * 0.02;
            break;
        return payment;
    }
}


