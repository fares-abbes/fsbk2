package com.mss.unified.services;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

@Service

public class GenerateCardService {
	
	
    static String strrev(String str) {
        if (str == null)
            return "";
        String revstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr += str.charAt(i);
        }
        return revstr;
    }
    public static String completed_number(String prefix, int length, String LowRange, String HigthRange)

	{

		String ccnumber = prefix;
		String ff ="" + ThreadLocalRandom.current().nextInt(9000000);
		if((ff.length()+ccnumber.length())>LowRange.length())
			ff=ff.substring(0,LowRange.length()-ccnumber.length());
		while (ccnumber.length() < (length - 1)) {
			

			if (ccnumber.length() < LowRange.length())
			{
				while (Double.parseDouble(prefix +ff) < Double.parseDouble(LowRange)
						|| Double.parseDouble(prefix +ff) > Double.parseDouble(HigthRange))
				{
					 ff ="" + ThreadLocalRandom.current().nextInt(9000000);
						if((ff.length()+ccnumber.length())>LowRange.length())
							ff=ff.substring(0,LowRange.length()-ccnumber.length());
				}
				ccnumber += ff;
			}
			else
			{
				ccnumber += new Double(Math.floor(Math.random() * 10)).intValue();
			}
		}

		String reversedCCnumberString = strrev(ccnumber);

		List<Integer> reversedCCnumberList = new Vector<>();

		for (int i = 0; i < reversedCCnumberString.length(); i++) {

			reversedCCnumberList.add(new Integer(String

					.valueOf(reversedCCnumberString.charAt(i))));

		}

		int sum = 0;

		int pos = 0;

		Integer[] reversedCCnumber = reversedCCnumberList

				.toArray(new Integer[reversedCCnumberList.size()]);

		while (pos < length - 1) {

			int odd = reversedCCnumber[pos] * 2;

			if (odd > 9) {

				odd -= 9;

			}

			sum += odd;

			if (pos != (length - 2)) {

				sum += reversedCCnumber[pos + 1];

			}

			pos += 2;

		}

		int checkdigit = new Double(((Math.floor(sum / 10) + 1) * 10 - sum) % 10).intValue();

		ccnumber += checkdigit;

		return ccnumber;

	}



}