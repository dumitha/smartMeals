package md5a52c4c10eb5e67b448cefcedb659de12;


public class MyMealsAdapterViewHolder
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SmartMeal.Droid.Adapters.MyMealsAdapterViewHolder, SmartMeal.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyMealsAdapterViewHolder.class, __md_methods);
	}


	public MyMealsAdapterViewHolder () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MyMealsAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("SmartMeal.Droid.Adapters.MyMealsAdapterViewHolder, SmartMeal.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
