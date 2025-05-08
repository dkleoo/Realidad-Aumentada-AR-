package com.example.realidad_aumentada_ar.ui.product.model

data class ProductsModel(
    val idProduct: Int = 0,
    val idCategory: Int = 0,
    val nameProduct: String = "",
    val descriptionProduct: String = "",
    val priceProduct: String = "",
    val imageProduct: String = "",
    val glb: String = "",
)

data class CategoryProduct(
    val id: Int = 0,
    val name: String = "",
)

data class CategoryAndProducts(
    val name: String = "",
    val lstProducts: List<ProductsModel>
)

fun getProductsByStore(): List<CategoryAndProducts> {

    val category = listOf(
        CategoryProduct(1, "Abarrotes"),
        CategoryProduct(2, "Bebidas"),
        CategoryProduct(3, "Dulces y Snacks"),
        CategoryProduct(4, "Limpieza")
    )

    val products = listOf(
        // Abarrotes (idCategory = 1)
        ProductsModel(1, 1, "Bandeja paisa", "Bandeja paisa", "3.50", "https://www.infobae.com/new-resizer/j8Tn2FTf03GyboaZXdMHZtfrIjk=/arc-anglerfish-arc2-prod-infobae/public/7ZLBIEXDAFEUFB2MXROVEX2DHI.jpg", glb = "models/bandeja_paisa.glb"),
        ProductsModel(2, 1, "Frijoles", "Frijol rojo 500g", "2.90", "https://megatiendas.vtexassets.com/arquivos/ids/175295-800-450?v=638764357336730000&width=800&height=450&aspect=true"),
        ProductsModel(3, 1, "Lentejas", "Lentejas verdes 500g", "2.50", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7k6V1Ii3Q9m1HAnfonJDUGdQ-psocfoULQA&s"),
        ProductsModel(4, 1, "Aceite", "Aceite vegetal 900ml", "5.20", "https://exitocol.vteximg.com.br/arquivos/ids/26677033/Aceite-Vegetal-FRESCAMPO-900-ml-3257072_a.jpg"),
        ProductsModel(5, 1, "Sal", "Sal refinada 1kg", "1.20", "https://jumbocolombiaio.vtexassets.com/arquivos/ids/752384/7703812101202-1.jpg?v=638735951604900000"),
        ProductsModel(6, 1, "Azúcar", "Azúcar blanca 1kg", "2.30", "https://olimpica.vtexassets.com/arquivos/ids/614541/7702059402028.jpg?v=637626519480170000"),
        ProductsModel(7, 1, "Harina", "Harina de trigo 1kg", "2.10", "https://jumbocolombiaio.vtexassets.com/arquivos/ids/569242-800-800?v=638429353203530000&width=800&height=800&aspect=true"),
        ProductsModel(8, 1, "Pasta", "Spaghetti 500g", "2.00", "https://exitocol.vtexassets.com/arquivos/ids/22208873/Pasta-Clasica-Spaghetti-X-500-gr-13653_b.jpg?v=638467620960470000"),
        ProductsModel(9, 1, "Atún", "Lata de atún en aceite", "4.50", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXW9IrzwrhyDDYm2JfZ4gObuq7GSAg5sCjLQ&s"),
        ProductsModel(10, 1, "Huevos", "Docena de huevos", "6.00", "https://okdiario.com/img/2022/09/20/la-verdadera-razon-por-la-que-los-huevos-se-venden-en-docenas.jpg"),

        // Bebidas (idCategory = 2)
        ProductsModel(11, 2, "Agua", "Botella de agua 600ml", "1.00", "https://licoresmedellin.com/cdn/shop/files/AGUA_CRISTAL_BOTELLA_600ML.jpg?crop=center&height=600&v=1718992311&width=600"),
        ProductsModel(12, 2, "Gaseosa", "Coca-Cola 1.5L", "4.20", "https://colsubsidio.vteximg.com.br/arquivos/ids/173165/7702535011799.jpg?v=637559425222400000"),
        ProductsModel(13, 2, "Jugo Hit", "Jugo de fruta 1L", "3.10", "https://www.google.com/url?sa=i&url=https%3A%2F%2Flicoresmedellin.com%2Fproducts%2Fjugo-hit-frutas-tropicales-tetrapack-litro-1l&psig=AOvVaw2aon7m2pN_eRS9Bi2i0p6X&ust=1746741679971000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPj2sIOuko0DFQAAAAAdAAAAABAE"),
        ProductsModel(14, 2, "Cerveza", "Cerveza Poker lata", "2.80", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvSjCY0YpJ7vMNSSNzohiK753Sri7HqWcrNA&s"),
        ProductsModel(15, 2, "Energizante", "Red Bull 250ml", "5.00", "https://licoresmedellin.com/cdn/shop/files/BEBIDA_ENERGIZANTE_REDBULL_GRANDE_250ML.jpg?v=1718985611"),
        ProductsModel(16, 2, "Café", "Café instantáneo 170g", "6.30", "https://exitocol.vtexassets.com/arquivos/ids/26658302/Cafe-Instantaneo-X-170-gr-5982_b.jpg?v=638739801337770000"),
        ProductsModel(17, 2, "Té", "Té en bolsas x20", "3.00", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeGUYSVPvKUDNEKg-JAK6LnJ_g6mRC5mjN_g&s"),
        ProductsModel(18, 2, "Chicha", "Chicha morada 500ml", "2.50", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTN19Hv8_XWilOnrSnuuSwRLInt3a89YXXL_g&s"),
        ProductsModel(19, 2, "Malta", "Malta Pony Malta 330ml", "2.00", "https://cdn.inoutdelivery.com/altoque.inoutdelivery.com.co/lg/1656090010574-Pony.webp"),
        ProductsModel(20, 2, "Agua saborizada", "Manzana Postobón 600ml", "1.80", "https://mercadoslpineda.co/6092-thickbox_default/gaseosa-postobon-x-600-ml-manzana-botella.jpg"),

        // Dulces y Snacks (idCategory = 3)
        ProductsModel(21, 3, "Chocolatina Jet", "Chocolatina pequeña", "0.80", "https://exitocol.vtexassets.com/arquivos/ids/26634484/Chocolates-Mini-X-24-Und-532015_b.jpg?v=638739412340800000"),
        ProductsModel(22, 3, "Galletas Festival", "Galletas rellenas", "1.50", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHtUb4q31ianwxJYKpaADagYS2sKwIllshFA&s"),
        ProductsModel(23, 3, "Chicles Trident", "Paquete de chicles", "1.00", "https://unidrogas.vtexassets.com/arquivos/ids/379394-800-800?v=638416842670400000&width=800&height=800&aspect=true"),
        ProductsModel(24, 3, "Papas Margarita", "Bolsa pequeña", "2.00", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRPalgQ8fzlPRSqwqeTm_KocFV-ngQcTD1mg&s"),
        ProductsModel(25, 3, "Maní salado", "Bolsa 100g", "1.80", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRPalgQ8fzlPRSqwqeTm_KocFV-ngQcTD1mg&s"),
        ProductsModel(26, 3, "Barrilete", "Paleta de dulce", "0.50", "https://png.pngtree.com/png-vector/20241030/ourmid/pngtree-colorful-candy-lollipop-png-image_14167740.png"),
        ProductsModel(27, 3, "Mentas", "Mentas en bolsa", "1.20", "https://vaquitaexpress.com.co/media/catalog/product/cache/e89ece728e3939ca368b457071d3c0be/7/7/7702993051078.jpg"),
        ProductsModel(28, 3, "Gomitas", "Bolsa de gomitas", "1.70", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvVBnJ_mo7gmPDVZgGtrZWq8X082PMPWd3tQ&s"),
        ProductsModel(29, 3, "Tostacos", "Snacks de maíz", "2.20", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrbe1BmHdL8FXZoOabGwCvHqJb6osE_n1zjg&s"),
        ProductsModel(30, 3, "Cocadas", "Dulce de coco", "1.90", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLtlSlYfr8oqGE1QtUq5wYANHEcu9mWgvLRA&s"),

        // Limpieza (idCategory = 4)
        ProductsModel(31, 4, "Jabón Rey", "Jabón en barra", "1.30", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpczPG76HGtTxH4KgNjRkIqLMTdMTek2LdRQ&s"),
        ProductsModel(32, 4, "Detergente", "Detergente en polvo 500g", "3.60", "https://vixark.b-cdn.net/lp-i-i-g/detergente-en-polvo-as-500g.jpg"),
        ProductsModel(33, 4, "Cloro", "Botella 1L", "2.50", "https://prodcdnmobisoft.oxxodomicilios.com/01H63NF57VRA2B4WQVCVF4VNAN.webp"),
        ProductsModel(34, 4, "Esponja", "Esponja multiusos", "1.00", "https://cdn1.totalcommerce.cloud/casalimpia/product-image/es/esponja-doble-uso-unidad-1.webp"),
        ProductsModel(35, 4, "Trapeador", "Trapeador básico", "4.50", "https://m.media-amazon.com/images/I/51m43UXarGL._AC_UF1000,1000_QL80_.jpg"),
        ProductsModel(36, 4, "Desinfectante", "Botella 500ml", "3.00", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ__Pygenkirb-jGXn0sCura_JgvhVallpTEmpzFSiTQJ1sv6hGEGR2y0P_PTseOM2AhYw&usqp=CAU"),
        ProductsModel(37, 4, "Lustra muebles", "Spray abrillantador", "5.00", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiWoES5KpfItq-o-9IRSAUNsRIRmhx9g5fgA&s"),
        ProductsModel(38, 4, "Toalla de cocina", "Rollo de cocina", "2.00", "https://metrocolombiaio.vtexassets.com/arquivos/ids/655954/7707151602185-1.jpg?v=638592447454470000"),
        ProductsModel(39, 4, "Escoba", "Escoba plástica", "4.00", "https://olimpica.vtexassets.com/arquivos/ids/613252/7704701201010.jpg?v=637626517163430000"),
        ProductsModel(40, 4, "Limpiavidrios", "Spray limpia vidrios", "3.50", "https://fuller.com.co/cdn/shop/files/limpiavidrios-liquido-spray-500-fuller.png?v=1724169078")
    )
    val categoryAndProducts : ArrayList<CategoryAndProducts> = ArrayList()
    category.forEach { cat ->
        categoryAndProducts.add(CategoryAndProducts(cat.name,products.filter { it.idCategory == cat.id }))
    }
    return categoryAndProducts
}