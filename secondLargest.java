function secondLargest(arr)
{
	
	if (arr.length==1)
	{
		return null;
	}
	else
	{	
		var max = arr[0];
		var twomax = arr[0];
		for (var i = 0; i < arr.length; i++)
		{
			if (arr[i]>max)
			{
				arr[i]=max;
			}
		}
		for (var i = 0; i < arr.length; i++)
		{
			if (max == arr[i])
			{
				arr[i]=0;
			}
		}
		for (var i = 0; i < arr.length; i++)
		{
			if (arr[i]>twomax)
			{
				arr[i]=twomax;
			}
		}
	}
}
