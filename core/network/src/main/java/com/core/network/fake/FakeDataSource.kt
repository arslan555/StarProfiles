package com.core.network.fake

import com.core.network.model.NetworkStarRepo
import org.intellij.lang.annotations.Language

object FakeDataSource {

    val sampleRepo = NetworkStarRepo.Item(
        3432266,
        "MDEwOlJlcG9zaXRvcnkzNDMyMjY2",
        "kotlin",
        "JetBrains/kotlin",
        false,
        owner = NetworkStarRepo.Item.Owner(
            "JetBrains",
            878437,
            "MDEyOk9yZ2FuaXphdGlvbjg3ODQzNw==",
            "https://avatars.githubusercontent.com/u/878437?v=4",
            "",
            "https://api.github.com/users/JetBrains",
        ),
        "https://github.com/JetBrains/kotlin",
        "The Kotlin Programming Language. ",
        false,
        "https://api.github.com/repos/JetBrains/kotlin",
        topics = listOf(
            "compiler",
            "gradle-plugin",
            "intellij-plugin",
            "kotlin",
            "kotlin-library",
            "maven-plugin",
            "programming-language"
        ),
    )

    val sampleRepos = NetworkStarRepo(
        3558,
        false,
        items = listOf(
            NetworkStarRepo.Item(
                3432266,
                "MDEwOlJlcG9zaXRvcnkzNDMyMjY2",
                "kotlin",
                "JetBrains/kotlin",
                false,
                owner = NetworkStarRepo.Item.Owner(
                    "JetBrains",
                    878437,
                    "MDEyOk9yZ2FuaXphdGlvbjg3ODQzNw==",
                    "https://avatars.githubusercontent.com/u/878437?v=4",
                    "",
                    "https://api.github.com/users/JetBrains",
                ),
                "https://github.com/JetBrains/kotlin",
                "The Kotlin Programming Language. ",
                false,
                "https://api.github.com/repos/JetBrains/kotlin",
                topics = listOf(
                    "compiler",
                    "gradle-plugin",
                    "intellij-plugin",
                    "kotlin",
                    "kotlin-library",
                    "maven-plugin",
                    "programming-language"
                ),
            ),
            NetworkStarRepo.Item(
                32647256,
                "MDEwOlJlcG9zaXRvcnkzNDMyMjY2",
                "Bandhook-Kotlin",
                "antoniolg/Bandhook-Kotlin",
                false,
                owner = NetworkStarRepo.Item.Owner(
                    "antoniolg",
                    2178243,
                    "MDQ6VXNlcjIxNzgyNDM=",
                    "https://avatars.githubusercontent.com/u/2178243?v=4",
                    "",
                    "https://api.github.com/users/JetBrains",
                ),
                "https://github.com/JetBrains/kotlin",
                "The Kotlin Programming Language. ",
                false,
                "https://api.github.com/repos/JetBrains/kotlin",
                topics = listOf(
                    "compiler",
                    "gradle-plugin",
                    "intellij-plugin",
                    "kotlin",
                    "kotlin-library",
                    "maven-plugin",
                    "programming-language"
                ),
            )
        )
    )

    @Language("JSON")
    val repoItem = """
         {
            "id": 3432266,
            "node_id": "MDEwOlJlcG9zaXRvcnkzNDMyMjY2",
            "name": "kotlin",
            "full_name": "JetBrains/kotlin",
            "private": false,
            "owner": {
                "login": "JetBrains",
                "id": 878437,
                "node_id": "MDEyOk9yZ2FuaXphdGlvbjg3ODQzNw==",
                "avatar_url": "https://avatars.githubusercontent.com/u/878437?v=4",
                "gravatar_id": "",
                "url": "https://api.github.com/users/JetBrains",
                "html_url": "https://github.com/JetBrains",
                "followers_url": "https://api.github.com/users/JetBrains/followers",
                "following_url": "https://api.github.com/users/JetBrains/following{/other_user}",
                "gists_url": "https://api.github.com/users/JetBrains/gists{/gist_id}",
                "starred_url": "https://api.github.com/users/JetBrains/starred{/owner}{/repo}",
                "subscriptions_url": "https://api.github.com/users/JetBrains/subscriptions",
                "organizations_url": "https://api.github.com/users/JetBrains/orgs",
                "repos_url": "https://api.github.com/users/JetBrains/repos",
                "events_url": "https://api.github.com/users/JetBrains/events{/privacy}",
                "received_events_url": "https://api.github.com/users/JetBrains/received_events",
                "type": "Organization",
                "site_admin": false
            },
            "html_url": "https://github.com/JetBrains/kotlin",
            "description": "The Kotlin Programming Language. ",
            "fork": false,
            "url": "https://api.github.com/repos/JetBrains/kotlin",
            "forks_url": "https://api.github.com/repos/JetBrains/kotlin/forks",
            "keys_url": "https://api.github.com/repos/JetBrains/kotlin/keys{/key_id}",
            "collaborators_url": "https://api.github.com/repos/JetBrains/kotlin/collaborators{/collaborator}",
            "teams_url": "https://api.github.com/repos/JetBrains/kotlin/teams",
            "hooks_url": "https://api.github.com/repos/JetBrains/kotlin/hooks",
            "issue_events_url": "https://api.github.com/repos/JetBrains/kotlin/issues/events{/number}",
            "events_url": "https://api.github.com/repos/JetBrains/kotlin/events",
            "assignees_url": "https://api.github.com/repos/JetBrains/kotlin/assignees{/user}",
            "branches_url": "https://api.github.com/repos/JetBrains/kotlin/branches{/branch}",
            "tags_url": "https://api.github.com/repos/JetBrains/kotlin/tags",
            "blobs_url": "https://api.github.com/repos/JetBrains/kotlin/git/blobs{/sha}",
            "git_tags_url": "https://api.github.com/repos/JetBrains/kotlin/git/tags{/sha}",
            "git_refs_url": "https://api.github.com/repos/JetBrains/kotlin/git/refs{/sha}",
            "trees_url": "https://api.github.com/repos/JetBrains/kotlin/git/trees{/sha}",
            "statuses_url": "https://api.github.com/repos/JetBrains/kotlin/statuses/{sha}",
            "languages_url": "https://api.github.com/repos/JetBrains/kotlin/languages",
            "stargazers_url": "https://api.github.com/repos/JetBrains/kotlin/stargazers",
            "contributors_url": "https://api.github.com/repos/JetBrains/kotlin/contributors",
            "subscribers_url": "https://api.github.com/repos/JetBrains/kotlin/subscribers",
            "subscription_url": "https://api.github.com/repos/JetBrains/kotlin/subscription",
            "commits_url": "https://api.github.com/repos/JetBrains/kotlin/commits{/sha}",
            "git_commits_url": "https://api.github.com/repos/JetBrains/kotlin/git/commits{/sha}",
            "comments_url": "https://api.github.com/repos/JetBrains/kotlin/comments{/number}",
            "issue_comment_url": "https://api.github.com/repos/JetBrains/kotlin/issues/comments{/number}",
            "contents_url": "https://api.github.com/repos/JetBrains/kotlin/contents/{+path}",
            "compare_url": "https://api.github.com/repos/JetBrains/kotlin/compare/{base}...{head}",
            "merges_url": "https://api.github.com/repos/JetBrains/kotlin/merges",
            "archive_url": "https://api.github.com/repos/JetBrains/kotlin/{archive_format}{/ref}",
            "downloads_url": "https://api.github.com/repos/JetBrains/kotlin/downloads",
            "issues_url": "https://api.github.com/repos/JetBrains/kotlin/issues{/number}",
            "pulls_url": "https://api.github.com/repos/JetBrains/kotlin/pulls{/number}",
            "milestones_url": "https://api.github.com/repos/JetBrains/kotlin/milestones{/number}",
            "notifications_url": "https://api.github.com/repos/JetBrains/kotlin/notifications{?since,all,participating}",
            "labels_url": "https://api.github.com/repos/JetBrains/kotlin/labels{/name}",
            "releases_url": "https://api.github.com/repos/JetBrains/kotlin/releases{/id}",
            "deployments_url": "https://api.github.com/repos/JetBrains/kotlin/deployments",
            "created_at": "2012-02-13T17:29:58Z",
            "updated_at": "2023-06-24T18:22:21Z",
            "pushed_at": "2023-06-24T12:31:22Z",
            "git_url": "git://github.com/JetBrains/kotlin.git",
            "ssh_url": "git@github.com:JetBrains/kotlin.git",
            "clone_url": "https://github.com/JetBrains/kotlin.git",
            "svn_url": "https://github.com/JetBrains/kotlin",
            "homepage": "https://kotlinlang.org",
            "size": 2034384,
            "stargazers_count": 45015,
            "watchers_count": 45015,
            "language": "Kotlin",
            "has_issues": false,
            "has_projects": false,
            "has_downloads": true,
            "has_wiki": false,
            "has_pages": false,
            "has_discussions": false,
            "forks_count": 5564,
            "mirror_url": null,
            "archived": false,
            "disabled": false,
            "open_issues_count": 153,
            "license": null,
            "allow_forking": true,
            "is_template": false,
            "web_commit_signoff_required": false,
            "topics": [
                "compiler",
                "gradle-plugin",
                "intellij-plugin",
                "kotlin",
                "kotlin-library",
                "maven-plugin",
                "programming-language"
            ],
            "visibility": "public",
            "forks": 5564,
            "open_issues": 153,
            "watchers": 45015,
            "default_branch": "master",
            "score": 1.0
        }
        """.trimIndent()

    @Language("JSON")
    val repos = """ 
    {
       "total_count": 3558,
       "incomplete_results": false,
       "items": [
            {
      "id": 3432266,
      "node_id": "MDEwOlJlcG9zaXRvcnkzNDMyMjY2",
      "name": "kotlin",
      "full_name": "JetBrains/kotlin",
      "private": false,
      "owner": {
        "login": "JetBrains",
        "id": 878437,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjg3ODQzNw==",
        "avatar_url": "https://avatars.githubusercontent.com/u/878437?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/JetBrains",
        "html_url": "https://github.com/JetBrains",
        "followers_url": "https://api.github.com/users/JetBrains/followers",
        "following_url": "https://api.github.com/users/JetBrains/following{/other_user}",
        "gists_url": "https://api.github.com/users/JetBrains/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/JetBrains/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/JetBrains/subscriptions",
        "organizations_url": "https://api.github.com/users/JetBrains/orgs",
        "repos_url": "https://api.github.com/users/JetBrains/repos",
        "events_url": "https://api.github.com/users/JetBrains/events{/privacy}",
        "received_events_url": "https://api.github.com/users/JetBrains/received_events",
        "type": "Organization",
        "site_admin": false
      },
      "html_url": "https://github.com/JetBrains/kotlin",
      "description": "The Kotlin Programming Language. ",
      "fork": false,
      "url": "https://api.github.com/repos/JetBrains/kotlin",
      "forks_url": "https://api.github.com/repos/JetBrains/kotlin/forks",
      "keys_url": "https://api.github.com/repos/JetBrains/kotlin/keys{/key_id}",
      "collaborators_url": "https://api.github.com/repos/JetBrains/kotlin/collaborators{/collaborator}",
      "teams_url": "https://api.github.com/repos/JetBrains/kotlin/teams",
      "hooks_url": "https://api.github.com/repos/JetBrains/kotlin/hooks",
      "issue_events_url": "https://api.github.com/repos/JetBrains/kotlin/issues/events{/number}",
      "events_url": "https://api.github.com/repos/JetBrains/kotlin/events",
      "assignees_url": "https://api.github.com/repos/JetBrains/kotlin/assignees{/user}",
      "branches_url": "https://api.github.com/repos/JetBrains/kotlin/branches{/branch}",
      "tags_url": "https://api.github.com/repos/JetBrains/kotlin/tags",
      "blobs_url": "https://api.github.com/repos/JetBrains/kotlin/git/blobs{/sha}",
      "git_tags_url": "https://api.github.com/repos/JetBrains/kotlin/git/tags{/sha}",
      "git_refs_url": "https://api.github.com/repos/JetBrains/kotlin/git/refs{/sha}",
      "trees_url": "https://api.github.com/repos/JetBrains/kotlin/git/trees{/sha}",
      "statuses_url": "https://api.github.com/repos/JetBrains/kotlin/statuses/{sha}",
      "languages_url": "https://api.github.com/repos/JetBrains/kotlin/languages",
      "stargazers_url": "https://api.github.com/repos/JetBrains/kotlin/stargazers",
      "contributors_url": "https://api.github.com/repos/JetBrains/kotlin/contributors",
      "subscribers_url": "https://api.github.com/repos/JetBrains/kotlin/subscribers",
      "subscription_url": "https://api.github.com/repos/JetBrains/kotlin/subscription",
      "commits_url": "https://api.github.com/repos/JetBrains/kotlin/commits{/sha}",
      "git_commits_url": "https://api.github.com/repos/JetBrains/kotlin/git/commits{/sha}",
      "comments_url": "https://api.github.com/repos/JetBrains/kotlin/comments{/number}",
      "issue_comment_url": "https://api.github.com/repos/JetBrains/kotlin/issues/comments{/number}",
      "contents_url": "https://api.github.com/repos/JetBrains/kotlin/contents/{+path}",
      "compare_url": "https://api.github.com/repos/JetBrains/kotlin/compare/{base}...{head}",
      "merges_url": "https://api.github.com/repos/JetBrains/kotlin/merges",
      "archive_url": "https://api.github.com/repos/JetBrains/kotlin/{archive_format}{/ref}",
      "downloads_url": "https://api.github.com/repos/JetBrains/kotlin/downloads",
      "issues_url": "https://api.github.com/repos/JetBrains/kotlin/issues{/number}",
      "pulls_url": "https://api.github.com/repos/JetBrains/kotlin/pulls{/number}",
      "milestones_url": "https://api.github.com/repos/JetBrains/kotlin/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/JetBrains/kotlin/notifications{?since,all,participating}",
      "labels_url": "https://api.github.com/repos/JetBrains/kotlin/labels{/name}",
      "releases_url": "https://api.github.com/repos/JetBrains/kotlin/releases{/id}",
      "deployments_url": "https://api.github.com/repos/JetBrains/kotlin/deployments",
      "created_at": "2012-02-13T17:29:58Z",
      "updated_at": "2023-06-24T18:36:41Z",
      "pushed_at": "2023-06-24T12:31:22Z",
      "git_url": "git://github.com/JetBrains/kotlin.git",
      "ssh_url": "git@github.com:JetBrains/kotlin.git",
      "clone_url": "https://github.com/JetBrains/kotlin.git",
      "svn_url": "https://github.com/JetBrains/kotlin",
      "homepage": "https://kotlinlang.org",
      "size": 2034384,
      "stargazers_count": 45016,
      "watchers_count": 45016,
      "language": "Kotlin",
      "has_issues": false,
      "has_projects": false,
      "has_downloads": true,
      "has_wiki": false,
      "has_pages": false,
      "has_discussions": false,
      "forks_count": 5565,
      "mirror_url": null,
      "archived": false,
      "disabled": false,
      "open_issues_count": 153,
      "license": null,
      "allow_forking": true,
      "is_template": false,
      "web_commit_signoff_required": false,
      "topics": [
        "compiler",
        "gradle-plugin",
        "intellij-plugin",
        "kotlin",
        "kotlin-library",
        "maven-plugin",
        "programming-language"
      ],
      "visibility": "public",
      "forks": 5565,
      "open_issues": 153,
      "watchers": 45016,
      "default_branch": "master",
      "score": 1
    },
             {
      "id": 32647256,
      "node_id": "MDEwOlJlcG9zaXRvcnkzMjY0NzI1Ng==",
      "name": "Bandhook-Kotlin",
      "full_name": "antoniolg/Bandhook-Kotlin",
      "private": false,
      "owner": {
        "login": "antoniolg",
        "id": 2178243,
        "node_id": "MDQ6VXNlcjIxNzgyNDM=",
        "avatar_url": "https://avatars.githubusercontent.com/u/2178243?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/antoniolg",
        "html_url": "https://github.com/antoniolg",
        "followers_url": "https://api.github.com/users/antoniolg/followers",
        "following_url": "https://api.github.com/users/antoniolg/following{/other_user}",
        "gists_url": "https://api.github.com/users/antoniolg/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/antoniolg/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/antoniolg/subscriptions",
        "organizations_url": "https://api.github.com/users/antoniolg/orgs",
        "repos_url": "https://api.github.com/users/antoniolg/repos",
        "events_url": "https://api.github.com/users/antoniolg/events{/privacy}",
        "received_events_url": "https://api.github.com/users/antoniolg/received_events",
        "type": "User",
        "site_admin": false
      },
      "html_url": "https://github.com/antoniolg/Bandhook-Kotlin",
      "description": "A showcase music app for Android entirely written using Kotlin language",
      "fork": false,
      "url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin",
      "forks_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/forks",
      "keys_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/keys{/key_id}",
      "collaborators_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/collaborators{/collaborator}",
      "teams_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/teams",
      "hooks_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/hooks",
      "issue_events_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/issues/events{/number}",
      "events_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/events",
      "assignees_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/assignees{/user}",
      "branches_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/branches{/branch}",
      "tags_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/tags",
      "blobs_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/git/blobs{/sha}",
      "git_tags_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/git/tags{/sha}",
      "git_refs_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/git/refs{/sha}",
      "trees_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/git/trees{/sha}",
      "statuses_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/statuses/{sha}",
      "languages_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/languages",
      "stargazers_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/stargazers",
      "contributors_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/contributors",
      "subscribers_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/subscribers",
      "subscription_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/subscription",
      "commits_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/commits{/sha}",
      "git_commits_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/git/commits{/sha}",
      "comments_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/comments{/number}",
      "issue_comment_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/issues/comments{/number}",
      "contents_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/contents/{+path}",
      "compare_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/compare/{base}...{head}",
      "merges_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/merges",
      "archive_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/{archive_format}{/ref}",
      "downloads_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/downloads",
      "issues_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/issues{/number}",
      "pulls_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/pulls{/number}",
      "milestones_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/notifications{?since,all,participating}",
      "labels_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/labels{/name}",
      "releases_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/releases{/id}",
      "deployments_url": "https://api.github.com/repos/antoniolg/Bandhook-Kotlin/deployments",
      "created_at": "2015-03-21T19:41:38Z",
      "updated_at": "2023-06-19T15:10:12Z",
      "pushed_at": "2018-04-10T17:01:11Z",
      "git_url": "git://github.com/antoniolg/Bandhook-Kotlin.git",
      "ssh_url": "git@github.com:antoniolg/Bandhook-Kotlin.git",
      "clone_url": "https://github.com/antoniolg/Bandhook-Kotlin.git",
      "svn_url": "https://github.com/antoniolg/Bandhook-Kotlin",
      "homepage": null,
      "size": 5483,
      "stargazers_count": 1859,
      "watchers_count": 1859,
      "language": "Kotlin",
      "has_issues": true,
      "has_projects": true,
      "has_downloads": true,
      "has_wiki": true,
      "has_pages": false,
      "has_discussions": false,
      "forks_count": 383,
      "mirror_url": null,
      "archived": false,
      "disabled": false,
      "open_issues_count": 13,
      "license": {
        "key": "apache-2.0",
        "name": "Apache License 2.0",
        "spdx_id": "Apache-2.0",
        "url": "https://api.github.com/licenses/apache-2.0",
        "node_id": "MDc6TGljZW5zZTI="
      },
      "allow_forking": true,
      "is_template": false,
      "web_commit_signoff_required": false,
      "topics": [],
      "visibility": "public",
      "forks": 383,
      "open_issues": 13,
      "watchers": 1859,
      "default_branch": "master",
      "score": 1
    }
      ]
    }
    """.trimIndent()
}