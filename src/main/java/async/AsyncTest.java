package async;

import io.vavr.collection.List;
import io.vavr.*;
import io.vavr.control.Option;

import java.util.concurrent.CompletableFuture;

/**
 * You should complete the function in this class
 */
class AsyncTest {

  private static java.util.List<Enterprise> enterprises = List.of(
      new Enterprise("ent_1", "Google", "ceo_2"),
      new Enterprise("ent_2", "Facebook", "ceo_1")
  );

  private static java.util.List<Ceo> ceos = List.of(
      new Ceo("ceo_1", "Mark"),
      new Ceo("ceo_2", "Sundar"),
      new Ceo("ceo_3", "Bill")
  );

  public static CompletableFuture<Option<Ceo>> getCeoById(String ceo_id) {
	  if (ceos.contains(ceo_id)) {
		  return ceos.toString();
	  }
	  else return null;
  }

  public static CompletableFuture<Option<Enterprise>> getEnterpriseByCeoId(String ceo_id) {
	  if (enterprises.contains(ceo_id)) {
		  return enterprises.toString();
	  }
	  else return null;
  }

  public static CompletableFuture<Tuple2<Option<Ceo>, Option<Enterprise>>> getCEOAndEnterprise(String ceo_id) {
	  Ceo c = getCeoById(ceo_id);
	  Enterprise ent = getEnterpriseByCeoId(ceo_id);
	  Tuple2<Ceo, Enterprise> tupleCeoEnterprise = Tuple.of(c, ent);
	  return tupleCeoEnterprise;
  }

}
