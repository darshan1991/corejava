package Practice;

public class Constructor {
	
	int CounterIndex;
	
	protected Constructor(int IV)
	{
		CounterIndex = IV;
	}
public void increase()
{ CounterIndex  = CounterIndex + 1;
}
public void decrease()
{ CounterIndex  = CounterIndex - 1;
}
int getCounterIndex()
{
	return CounterIndex;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor counter = new Constructor(1);

counter.increase();
System.out.println(counter.getCounterIndex());
int a = counter.getCounterIndex();
counter.increase();
System.out.println(counter.getCounterIndex());
int b = counter.getCounterIndex();
if (a > b)
	counter.increase();
else
	counter.decrease();
System.out.println(counter.getCounterIndex());
	}

}
