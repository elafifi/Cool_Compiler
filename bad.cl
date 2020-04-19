class Complex inherits IO {
    ahm!ed : Int;
    y : Int;
    # -- error
    init(a : Int, b : Int) : Complex {
	{
	    ahm!ed <- a; -- error
	    y <- b;
	    self;
	}
    };
^   --error
&&   -- error
ahmed is boy -- true tokens
}