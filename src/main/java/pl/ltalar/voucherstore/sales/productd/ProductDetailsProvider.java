package pl.ltalar.voucherstore.sales.productd;

public interface ProductDetailsProvider {
    ProductDetails getByProductId(String productId);
}
