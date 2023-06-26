package com.core.data.mapper

import com.core.model.data.StarRepos
import com.core.network.model.NetworkStarRepo


fun NetworkStarRepo.Item.asEntity() = StarRepos(
    id = id,
    name = name,
    fullName = full_name,
    description = description,
    starsCount = stargazers_count,
    language = language,
    StarRepos.Owner(
        id = owner?.id,
        avatarUrl = owner?.avatar_url,
        htmlUrl = owner?.html_url
    )
)