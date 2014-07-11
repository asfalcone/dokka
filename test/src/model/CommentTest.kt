package org.jetbrains.dokka.tests

import org.junit.Test
import kotlin.test.*
import org.jetbrains.dokka.*

public class CommentTest {
    Test fun emptyDoc() {
        verifyModel("test/data/comments/emptyDoc.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals(DocumentationContent.Empty, doc)
            }
        }
    }

    Test fun emptyDocButComment() {
        verifyModel("test/data/comments/emptyDocButComment.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals(DocumentationContent.Empty, doc)
            }
        }
    }

    Test fun multilineDoc() {
        verifyModel("test/data/comments/multilineDoc.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals("""doc1
doc2
doc3""", doc.summary)
            }
        }
    }

    Test fun multipleDocs() {
        verifyModel("test/data/comments/multipleDocs.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals("""doc1
doc2
doc3""", doc.summary)
            }
        }
    }

    Test fun multilineDocWithComment() {
        verifyModel("test/data/comments/multilineDocWithComment.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals("""doc1
doc2
doc3""", doc.summary)
            }
        }
    }

    Test fun oneLineDoc() {
        verifyModel("test/data/comments/oneLineDoc.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals("doc", doc.summary)
            }
        }
    }

    Test fun oneLineDocWithComment() {
        verifyModel("test/data/comments/oneLineDocWithComment.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals("doc", doc.summary)
            }
        }
    }

    Test fun oneLineDocWithEmptyLine() {
        verifyModel("test/data/comments/oneLineDocWithEmptyLine.kt") { model ->
            with(model.nodes.single().members.single()) {
                assertEquals("doc", doc.summary)
            }
        }
    }
}
