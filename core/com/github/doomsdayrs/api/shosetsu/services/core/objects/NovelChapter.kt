package com.github.doomsdayrs.api.shosetsu.services.core.objects

/*
 * This file is part of shosetsu-services.
 * shosetsu-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * shosetsu-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with shosetsu-services.  If not, see https://www.gnu.org/licenses/.
 * ====================================================================
 */

/**
 * shosetsu-services
 * 29 / May / 2019
 *
 * @author github.com/doomsdayrs
 */
@Suppress("MemberVisibilityCanBePrivate")
class NovelChapter {
    var release = "unknown"
    var title = "unknown"
    var link = ""
    var order = 0.0

    override fun toString(): String {
        return "NovelChapter(release='$release', title='$title', link='$link', order=$order)"
    }
}