package org.nhta.nhta_kmp1.book.presentation.book_list.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import composekmpproject1.composeapp.generated.resources.Res
import composekmpproject1.composeapp.generated.resources.search_hint
import org.jetbrains.compose.resources.stringResource
import org.nhta.nhta_kmp1.core.presentation.DarkBlue
import org.nhta.nhta_kmp1.core.presentation.SandYellow

@Composable
fun BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: () -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        shape = RoundedCornerShape(100),
        colors = TextFieldDefaults.colors(
            cursorColor = DarkBlue,
            focusedIndicatorColor = SandYellow
        ),
        placeholder = {
            Text(
                text = stringResource(
                    Res.string.search_hint
                )
            )
        },
        leadingIcon = {

        }
    )
}