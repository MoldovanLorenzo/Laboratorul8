import java.util.List;
public class Operatii  implements Calculator {

    @Override
    public double add(double n1, double n2) throws Exception
    {
        if(n1==0 && n2==0)
        {
            throw new Exception("Numerele sunt nule");
        }
        else if(n1+n2==Double.POSITIVE_INFINITY)
            {
                throw new Exception("suma celor 2 numere este egala cun +infinit");
            }
        else if(n1+n2==Double.NEGATIVE_INFINITY)
            {
                throw new Exception("suma celor 2 numere este egala cu -infit");
            }
        else{
        return n1+n2;
        }
    }
    @Override
    public double divide(double n1 , double n2) throws Exception
    {
        if(n1==0 && n2==0)
        {
            throw new Exception("Numerele sunt nule");
        }
        else if(n1+n2==Double.POSITIVE_INFINITY)
            {
                throw new Exception("suma celor 2 numere este egala cun +infinit");
            }
        else if(n1+n2==Double.POSITIVE_INFINITY)
            {
                throw new Exception("suma celor 2 numere este egala cu -infit");
            }
        else{
            return n1/n2;
        }
    }
    @Override
    public double avarage(List<Double>valori) throws Exception
    {
        double suma=0;
        for(Double nr:valori)
        {suma=add(nr,suma);}
        return suma/valori.size();

    }
 }