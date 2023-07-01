package com.core.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.core.model.data.StarRepos

@Composable
fun Repo(
    modifier: Modifier,
    repo: StarRepos
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp), verticalAlignment = Alignment.Top
        ) {
            if (repo.owner?.avatarUrl.isNullOrEmpty()) {
                Icon(
                    modifier = modifier
                        .size(50.dp)
                        .background(Color.LightGray.copy(alpha = 0.3f))
                        .padding(4.dp),
                    imageVector = Icons.Rounded.Person,
                    contentDescription = null,
                )
            } else {
                AsyncImage(
                    model = repo.owner?.avatarUrl,
                    contentDescription = null,
                    modifier = modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(50.dp))
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    text = repo.name ?: "",
                    modifier = Modifier
                        .fillMaxWidth(),
                    style = MaterialTheme.typography.body1.copy(MaterialTheme.colors.onSurface)
                )

                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = repo.fullName ?: "",
                    modifier = Modifier
                        .height(15.dp)
                        .fillMaxWidth(),
                    style = MaterialTheme.typography.body2.copy(
                        color = MaterialTheme.colors.onSurface,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Spacer(
            modifier = Modifier
                .height(2.dp)
                .fillMaxWidth()
                .padding(start = 10.dp)
                .background(Color.LightGray.copy(alpha = 0.3f))
        )
    }

}

@Preview
@Composable
fun previewRepo() {
    Repo(
        modifier = Modifier, repo = StarRepos(
            name = "kotlin",
            fullName = "JetBrains/kotlin",
            owner = StarRepos.Owner(avatarUrl = "https://avatars.githubusercontent.com/u/878437?v=4")
        )
    )
}