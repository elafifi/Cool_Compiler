--a: Int <- 5*4*3;
--init(a : Int, b : Int) : Complex {0};
--let a:Int, b:Int <- 5 in {3; a <- b*5;}
--while 3<2 then 5*3+4*2 pool
--if 5<1 then "ahmed" else {~5*5;"mohamed"; }FI;
--{(~(5+5))*5;}
--case 5 of a:Int => a <- 5; a:String => a <- 5; esac
class Main {
  a: Int;

  add(p1Name: Int): String {
       {
          let a:Int, b:Int <- 5 in {3; a <- b*5;};
          {(~(5+5))*5;};
          while 3<2 then 5*3+4*2 pool;
       }

      };
  main(): Object {
    {
    case 5 of a:Int => a <- 5; esac;
    a <- add(1);
    }
    };
  };