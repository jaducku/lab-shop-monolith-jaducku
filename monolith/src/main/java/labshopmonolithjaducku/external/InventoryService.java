package labshopmonolithjaducku.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "Inventory", url = "${api.url.Inventory}")
public interface InventoryService {
    @RequestMapping(method= RequestMethod.PUT, path="/inventories/{id}/decreasestock")
    public void decreaseStock(@PathVariable("id")  , @RequestBody DecreaseStockCommand decreaseStockCommand );
}
