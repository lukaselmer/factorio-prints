package com.factorioprints.data.json;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.ListAdapter;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder(alphabetic = true)
public class JsonBlueprint
{
    private final String title;
    private final String blueprintString;
    private final String descriptionMarkdown;
    private final List<String> tags;

    private final JsonImage image;
    private final String imageUrl;

    private final JsonAuthor author;
    private final UserId authorId;

    private final Instant createdDate;
    private final Instant lastUpdatedDate;

    private final Map<UserId, Boolean> favorites;

    private final int numberOfFavorites;

    private final String fileName;

    @Deprecated
    private final String thumbnail;

    public JsonBlueprint(
            String title,
            String blueprintString,
            String descriptionMarkdown,
            List<String> tags,
            JsonImage image,
            String imageUrl,
            JsonAuthor author,
            UserId authorId,
            Instant createdDate,
            Instant lastUpdatedDate,
            Map<UserId, Boolean> favorites,
            int numberOfFavorites,
            String fileName,
            String thumbnail)
    {
        this.title = title;
        this.blueprintString = blueprintString;
        this.descriptionMarkdown = descriptionMarkdown;
        this.tags = tags == null ? Lists.mutable.empty() : Lists.mutable.withAll(tags);
        this.image = image;
        this.imageUrl = imageUrl;
        this.author = author;
        this.authorId = authorId;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.favorites = favorites == null ? new LinkedHashMap<>() : favorites;
        this.numberOfFavorites = numberOfFavorites;
        this.fileName = fileName;
        this.thumbnail = thumbnail;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getBlueprintString()
    {
        return this.blueprintString;
    }

    public String getDescriptionMarkdown()
    {
        return this.descriptionMarkdown;
    }

    public MutableList<String> getTags()
    {
        return ListAdapter.adapt(this.tags);
    }

    public JsonImage getImage()
    {
        return this.image;
    }

    public String getImageUrl()
    {
        return this.imageUrl;
    }

    public JsonAuthor getAuthor()
    {
        return this.author;
    }

    public UserId getAuthorId()
    {
        return this.authorId;
    }

    public Instant getCreatedDate()
    {
        return this.createdDate;
    }

    public Instant getLastUpdatedDate()
    {
        return this.lastUpdatedDate;
    }

    public Map<UserId, Boolean> getFavorites()
    {
        return this.favorites;
    }

    public int getNumberOfFavorites()
    {
        return this.numberOfFavorites;
    }

    public String getFileName()
    {
        return this.fileName;
    }

    @Deprecated
    public String getThumbnail()
    {
        return this.thumbnail;
    }
}