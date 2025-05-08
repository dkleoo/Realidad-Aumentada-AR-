package com.example.realidad_aumentada_ar.ui.product

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ChipColors
import androidx.compose.material3.ChipElevation
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.realidad_aumentada_ar.ui.product.model.getProductsByStore
import com.example.realidad_aumentada_ar.ui.sceneview.SceneViewScreen
import com.example.realidad_aumentada_ar.ui.theme.AppTheme
import okhttp3.internal.wait

@Composable
fun ProductsScreen(padding: PaddingValues) {

    var selectItem by rememberSaveable { mutableStateOf(false) }
    var selectGLB by rememberSaveable { mutableStateOf("") }

    Column (
        modifier = Modifier
            .padding(padding)
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onBackground)
    ) {
        val lstProducts = getProductsByStore()
        var selectCat by remember { mutableStateOf("") }

        LaunchedEffect(Unit) {
            selectCat = lstProducts[0].name
        }

        Text(
            "Categorias",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 42.dp, bottom = 8.dp)
                .fillMaxWidth(),
            color = Color.Black
        )

        LazyRow {
            items(lstProducts) { category ->
                FilterChip(
                    onClick = {
                        selectCat = category.name
                    },
                    label = {
                        Text(
                            text = category.name,
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                    },
                    modifier = Modifier.padding(8.dp),
                    colors = FilterChipDefaults.filterChipColors(containerColor = Color.White),
                    selected = selectCat == category.name,
                )
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp)
        ) {
            val listProducts = lstProducts.find { it.name == selectCat }
            items(listProducts?.lstProducts ?: listOf()) { itProducts ->
                Card (
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                        .height(200.dp)
                        .clickable {
                            selectItem = true
                            selectGLB = itProducts.glb
                        },
                    elevation = CardDefaults.elevatedCardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize()
                    ) {
                        AsyncImage(
                            model = itProducts.imageProduct,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentScale = ContentScale.FillBounds
                        )
                        Text(
                            text = itProducts.nameProduct,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp),
                            color = Color.Black
                        )
                        Text(
                            text = "$${itProducts.priceProduct}",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                                .padding(bottom = 8.dp),
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
    if (selectItem) {
        SceneViewScreen(selectGLB)
    }
}

@Preview(
    device = "spec:width=411dp,height=891dp",
    showSystemUi = true,
    showBackground = true,
)
@Composable
fun ProductsScreenPreview() {
    AppTheme {
        ProductsScreen(padding = PaddingValues(vertical = 32.dp))
    }
}