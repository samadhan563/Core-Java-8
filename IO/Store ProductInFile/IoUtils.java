package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.core.Category;
import com.app.core.Product;

public class IoUtils 
{
	public static void populateData(Product product, String fileName) throws IOException
	{
		try(DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName))))
		{
			//Product product=new Product(100, "mango", FRUITS, parse("2019-01-01"), 500);
			dos.writeInt(product.getId());
			dos.writeUTF(product.getName());
			dos.writeUTF(product.getProductCatgeory().toString());
			dos.writeUTF(product.getManufactureDate().toString());
			dos.writeDouble(product.getPrice());
		}
	}


	public static Product restoreData(String fileName) throws IOException
	{
		File file=new File(fileName);
		if(file.canRead() && file.isFile() && file.exists())
		{
			try(DataInputStream dos=new DataInputStream(new BufferedInputStream(new FileInputStream(file))))
			{
				return new Product(dos.readInt(), dos.readUTF(), Category.valueOf(dos.readUTF()), LocalDate.parse(dos.readUTF()), dos.readDouble());
			}
		}
		return null;
	}
}
