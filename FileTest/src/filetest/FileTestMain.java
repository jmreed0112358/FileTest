package filetest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileTestMain
{

	public FileTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		Scanner input = null;

		try
		{
			input = new Scanner( new BufferedReader( new FileReader(
					"data/test.txt" ) ) );
			
			while ( input.hasNext( ) )
			{
				System.out.println( input.next( ) );
			}
		}
		catch( FileNotFoundException e )
		{
			System.out.println( "Caught FileNotFoundException" );
			e.printStackTrace( );
		}
		finally
		{
			if ( input != null )
			{
				input.close( );
			}
		}
	}

}
