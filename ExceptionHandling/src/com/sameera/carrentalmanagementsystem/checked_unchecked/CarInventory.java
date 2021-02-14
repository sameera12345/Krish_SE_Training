package com.sameera.carrentalmanagementsystem.checked_unchecked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.sameera.carrentalmanagementsystem.exceptions.*;

public class CarInventory {

    public static void main(String[] args){
        CarInventory carInventory = new CarInventory();

        try{
            System.out.println(carInventory.getDetails(10));
        } catch(RecordsFileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch(FileFormatException e){
            System.err.println(e.getMessage());
        }



    }

    public String getDetails(int carId) throws RecordsFileNotFoundException,FileFormatException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String oneLine = "NullData";

        try{
            fileReader =new FileReader("D:\\CarInventory\\Record.txt");
            bufferedReader = new BufferedReader(fileReader);
            String thisLine;
            while((thisLine = bufferedReader.readLine()) != null){
                if (thisLine.contains(String.valueOf(carId))){
                    oneLine = thisLine;
                    break;
                }
            }

            return oneLine;

        } catch (FileNotFoundException e){
            throw new RecordsFileNotFoundException("Record file not found in given directory");

        } catch (IOException e){
            throw new FileFormatException("Record File format not supported");
        }



        finally{
            try{
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(fileReader != null){
                    fileReader.close();
                }
            }
            catch (IOException e){
                System.err.println("Unable to close file");
            }

        }
    }
}
