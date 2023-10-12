package Shop;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    Shop shop;

    public ShopTest(Shop shop) {
        this.shop = shop;
    }

    public void startShopTest() {
        assertThat(shop).isInstanceOf(Shop.class);
        assertThat(shop.getProducts()).isNotEmpty();
        assertThat(shop.getProducts()).isNotNull();
        for (int i = 0; i < shop.getProducts().size(); i++) {
            assertThat(shop.getProducts().get(i)).isInstanceOf(Product.class);
        }

        Product maxProduct = shop.getMostExpensiveProduct();
        assertThat(maxProduct).isInstanceOf(Product.class);
        assertThat(maxProduct).isEqualTo(Collections.max(shop.getProducts()));
        List<Product> sortedPoductList = shop.sortProductsByPrice();
        if (sortedPoductList.size() >= 2) {
            for (int i = 0; i < sortedPoductList.size(); i++) {
                for (int j = i + 1; j < sortedPoductList.size(); j++)
                    assertThat(sortedPoductList.get(i)).isLessThanOrEqualTo(sortedPoductList.get(j));
            }
        }




    }





    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

}