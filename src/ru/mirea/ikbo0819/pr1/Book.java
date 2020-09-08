package ru.mirea.ikbo0819.pr1;

import java.lang.*;

public class Book
{
    private String Name;
    private int Page;
    private int Choice;

    public Book(String name, int page, int typeOfbook)
    {
        Name = name;
        Page = page;
        Choice = typeOfbook;
    }

    public Book(String name, int page)
    {
        Name = name;
        Page = page;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getPage()
    {
        return Page;
    }

    public void setPage(int page)
    {
        Page = page;
    }

    public int getChoice()
    {
        return Choice;
    }

    public void setChoice(int typeOfbook)
    {
        Choice = typeOfbook;
    }

    public void showInfo()
    {
        if(Choice==1)
        {
            System.out.println("Book choosen: "+Name + " with " +Page+ " pages"+" type: Modern Novel");
        }
        if(Choice==2)
        {
            {
                System.out.println("Book choosen: "+Name + " with " +Page+ " pages"+" type: Classic");
            }
        }
    }
}