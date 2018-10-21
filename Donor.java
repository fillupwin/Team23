/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opportunity2018;

/**
 * Donor. Organizes the attributes into their respective donors.
 * @author Phillip N, Emilio E, Kai W
 */
public class Donor 
{

    final private int donationID, donorID, zipCode;
    final private double weight, value, quantity;
    final private String companyName, firstName, middleName, lastName, emailAddress, spouseName, greeting, streetAddress, apartment, city, state, donorType, donationType, donationSource, donatedOn, foodCategory, foodName, quantityType, memo;
    
    public Donor(String[] arr)
    {

        this.donationID = Integer.parseInt(arr[0]);
	this.donorID = Integer.parseInt(arr[1]);
	this.companyName = arr[2];
	this.firstName = arr[3];
	this.middleName = arr[4];
	this.lastName = arr[5];
	this.emailAddress = arr[6];
	this.spouseName = arr[7];
	this.greeting = arr[8];
	this.streetAddress = arr[9];
	this.apartment = arr[10];
	this.city = arr[11];
	this.state = arr[12];
        if(!arr[13].equals(""))
        {
            this.zipCode = Integer.parseInt(arr[13]);
        }
        else
        {
            
            zipCode = -1;
            
        }
	this.donorType = arr[14];
	this.donationType = arr[15];
	this.donationSource = arr[16];
	this.donatedOn = arr[17];
	this.foodCategory = arr[18];
	this.foodName = arr[19];
	this.quantity = Double.parseDouble(arr[20]);
	this.quantityType = arr[21];
	this.weight = Double.parseDouble(arr[22]);
	this.value = Double.parseDouble(arr[23]);
	this.memo = arr[24];

    }

    public int getDonationID()
    {
	return donationID;
    }
	
    public int getDonorID()
    {
        return donorID;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getSpouseName()
    {
        return spouseName;
    }

    public String getGreeting()
    {
        return greeting;
    }

    public String getStreetAddress()
    {
        return streetAddress;
    }

    public String getApartment()
    {
        return apartment;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public int getZipCode()
    {
        return zipCode;
    }

    public String getDonorType()
    {
        return donorType;
    }

    public String getDonationType()
    {
        return donationType;
    }

    public String getDonationSource()
    {
        return donationSource;
    }

    public String getDonatedOn()
    {
        return donatedOn;
    }
    
    public String getMonthYear()
    {
        String[] date = donatedOn.split("/");
        String month = "";
        String monthYear = "";
        switch (date[0])
        {
            case"1":
                month = "January";
            case"2":
                month = "Febreuary";
            case"3":
                month = "March";
            case"4":
                month = "April";
            case"5":
                month = "May";
            case"6":
                month = "June";
            case"7":
                month = "July";
            case"8":
                month = "August";
            case"9":
                month = "September";
            case"10":
                month = "October";
            case"11":
                month = "November";
            case"12":
                month = "December";
                break;
        }
        String year = date[2];
        monthYear = month + year;
        return monthYear;
    }

    public String getFoodCategory()
    {
        return foodCategory;
    }

    public String getFoodName()
    {
        return foodName;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public String getQuantityType()
    {
        return quantityType;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getValue()
    {
        return value;
    }

    public String getMemo()
    {
        return memo;
    }
    
    @Override
    public String toString()
    {
        return("Donation ID: " + donationID + ", Dear: " + greeting);
    }

}
