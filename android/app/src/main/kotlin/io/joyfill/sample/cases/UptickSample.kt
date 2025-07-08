package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.rememberEditor

@Composable
internal fun UptickSample() = ThemedSample {
    Form(
        editor = rememberEditor(json),
        onUpload = {
            listOf("https://picsum.photos/200/300")
        }
    )
}

private val json = """
    {
      "_id": "686ba8e7ce0973d417f96f73",
      "type": "template",
      "stage": "published",
      "source": "template_686b9f5e5dc1e5c7823b0472",
      "metadata": {},
      "identifier": "doc_686ba8e7ce0973d417f96f73",
      "name": "New Template",
      "createdOn": 1751886056042,
      "files": [
        {
          "_id": "686b9f5e6a3471a6915ec932",
          "metadata": {},
          "name": "New File",
          "version": 1,
          "styles": {
            "margin": 4
          },
          "pages": [
            {
              "name": "New Page",
              "fieldPositions": [
                {
                  "field": "686b9f5e6068ee4a2f9a6e70",
                  "displayType": "original",
                  "width": 4,
                  "height": 8,
                  "x": 0,
                  "y": 0,
                  "titleDisplay": "inline",
                  "_id": "686b9f64660587c066629f37",
                  "type": "text"
                },
                {
                  "field": "686b9f6402c30afe541ef39d",
                  "displayType": "original",
                  "width": 4,
                  "height": 8,
                  "x": 0,
                  "y": 8,
                  "_id": "686b9f664f18551020521b64",
                  "type": "text"
                },
                {
                  "field": "686ba2acc29d6285eca45a4f",
                  "displayType": "original",
                  "width": 3,
                  "height": 23,
                  "x": 0,
                  "y": 16,
                  "targetValue": "686b9f522277fa65a3a7c06b",
                  "_id": "686ba2c09d9660747580bf7a",
                  "type": "dropdown"
                },
                {
                  "field": "686ba3174b12b95fc291aa78",
                  "displayType": "original",
                  "width": 4,
                  "height": 8,
                  "x": 1,
                  "y": 39,
                  "_id": "686ba31ed534b1239b61964d",
                  "type": "number"
                },
                {
                  "_id": "686bae2ebd51bd3b557ae543",
                  "type": "multiSelect",
                  "field": "686bae28bd144c528987b966",
                  "displayType": "original",
                  "targetValue": "686bab07001df613def0693b",
                  "x": 2,
                  "y": 47,
                  "width": 4,
                  "height": 15
                },
                {
                  "_id": "686bae342bcbe60e1359fea4",
                  "type": "multiSelect",
                  "field": "686bae30c91d87ddb0774f34",
                  "displayType": "original",
                  "targetValue": "686bab07c75954e0cbc7f657",
                  "x": 2,
                  "y": 62,
                  "width": 4,
                  "height": 15
                },
                {
                  "_id": "686bb0d671930fe507770211",
                  "type": "text",
                  "field": "686bb0d2994b4b02d87ff4e9",
                  "displayType": "original",
                  "x": 1,
                  "y": 77,
                  "width": 4,
                  "height": 8
                },
                {
                  "_id": "686bb0ee0ea7dc2c3d9dfa3c",
                  "type": "block",
                  "field": "686bb0dd6327c76532808a41",
                  "displayType": "original",
                  "x": 1,
                  "y": 85,
                  "width": 4,
                  "height": 5
                }
              ],
              "metadata": {},
              "hidden": false,
              "width": 816,
              "height": 1056,
              "cols": 8,
              "rowHeight": 8,
              "layout": "grid",
              "presentation": "normal",
              "margin": 0,
              "padding": 24,
              "borderWidth": 0,
              "_id": "686b9f5e39f848b285f3aef6"
            },
            {
              "_id": "686bae5c10f68ba44d49f8c6",
              "name": "",
              "width": 816,
              "height": 1056,
              "rowHeight": 8,
              "cols": 8,
              "fieldPositions": [
                {
                  "_id": "686bae650b80e2ab8d3b8886",
                  "type": "signature",
                  "field": "686bae5dc2a905b0d86253ad",
                  "displayType": "original",
                  "x": 3,
                  "y": 5,
                  "width": 4,
                  "height": 23
                },
                {
                  "_id": "686bae75c1c9d53ebc86d7b7",
                  "type": "block",
                  "field": "686bae6697a3bfefc54ce0b8",
                  "displayType": "original",
                  "x": 0,
                  "y": 0,
                  "width": 4,
                  "height": 5
                },
                {
                  "_id": "686bb2478b739a163a45f2ce",
                  "type": "block",
                  "field": "686bb24523bacb2829caa994",
                  "displayType": "original",
                  "fontSize": 28,
                  "fontWeight": "bold",
                  "x": 1,
                  "y": 28,
                  "width": 4,
                  "height": 5
                },
                {
                  "_id": "686bb25b8cd93f06381d3824",
                  "type": "text",
                  "field": "686bb25928eff154763184c1",
                  "displayType": "original",
                  "x": 1,
                  "y": 33,
                  "width": 4,
                  "height": 8,
                  "titleDisplay": "inline"
                }
              ],
              "layout": "grid",
              "presentation": "normal",
              "padding": 24
            },
            {
              "_id": "686bb17249124fbb1019bfee",
              "name": "",
              "width": 816,
              "height": 1056,
              "rowHeight": 8,
              "cols": 8,
              "fieldPositions": [
                {
                  "_id": "686bb18713deb17058b31e4c",
                  "type": "image",
                  "field": "686bb1758d69de4785ce98b6",
                  "displayType": "original",
                  "x": 3,
                  "y": 0,
                  "width": 2,
                  "height": 23,
                  "titleFontColor": "#282487",
                  "borderColor": "#e010b7",
                  "borderRadius": 33,
                  "padding": 12,
                  "borderWidth": 22,
                  "titleTextAlign": "center",
                  "titleTextTransform": "uppercase",
                  "titleTextDecoration": "underline",
                  "titleFontWeight": "bold",
                  "titleFontStyle": "italic"
                },
                {
                  "_id": "686bb1c73465e1ffe014742d",
                  "type": "text",
                  "field": "686bb1c1f969d2dc40a6487b",
                  "displayType": "original",
                  "x": 4,
                  "y": 23,
                  "width": 4,
                  "height": 8
                },
                {
                  "_id": "686bb2c68e5ee20d7a09d526",
                  "type": "block",
                  "field": "686bb2b8b98341655093c97a",
                  "displayType": "original",
                  "fontSize": 28,
                  "fontWeight": "bold",
                  "x": 4,
                  "y": 31,
                  "width": 4,
                  "height": 5
                },
                {
                  "_id": "686bb2cba959aa5049a33b47",
                  "type": "text",
                  "field": "686bb2c6f09bd7e527d4e551",
                  "displayType": "original",
                  "x": 3,
                  "y": 36,
                  "width": 4,
                  "height": 8,
                  "titleDisplay": "none"
                }
              ],
              "layout": "grid",
              "presentation": "normal",
              "padding": 24
            }
          ],
          "pageOrder": [
            "686b9f5e39f848b285f3aef6",
            "686bae5c10f68ba44d49f8c6",
            "686bb17249124fbb1019bfee"
          ],
          "views": []
        }
      ],
      "fields": [
        {
          "type": "text",
          "_id": "686b9f5e6068ee4a2f9a6e70",
          "identifier": "field_686b9f64c5c7aefec5891ddf",
          "title": "Title1",
          "description": "",
          "value": "yo my guy",
          "required": true,
          "tipTitle": "",
          "tipDescription": "",
          "tipVisible": false,
          "metadata": {},
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686b9f6402c30afe541ef39d",
                "condition": "*=",
                "_id": "686b9fbaf262e0b2154e200f"
              }
            ],
            "_id": "686b9fbaf262e0b2154e200e"
          },
          "file": "686b9f5e6a3471a6915ec932"
        },
        {
          "type": "text",
          "_id": "686b9f6402c30afe541ef39d",
          "identifier": "field_686b9f66bf65d946528136ab",
          "title": "title 2",
          "description": "",
          "required": false,
          "tipTitle": "",
          "tipDescription": "",
          "tipVisible": false,
          "metadata": {},
          "file": "686b9f5e6a3471a6915ec932"
        },
        {
          "type": "dropdown",
          "_id": "686ba2acc29d6285eca45a4f",
          "identifier": "field_686ba2c0c195948e73a32618",
          "title": "Dropdown",
          "description": "",
          "value": "686b9f522277fa65a3a7c06b",
          "required": false,
          "tipTitle": "",
          "tipDescription": "",
          "tipVisible": false,
          "metadata": {},
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686b9f5e6068ee4a2f9a6e70",
                "condition": "null=",
                "_id": "686ba3aaf262e0b2154e5a25"
              },
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686ba3174b12b95fc291aa78",
                "condition": "<",
                "value": -100,
                "_id": "686ba801f262e0b2154ec731"
              }
            ],
            "_id": "686ba3aaf262e0b2154e5a24"
          },
          "options": [
            {
              "_id": "686b9f522277fa65a3a7c06b",
              "value": "Yes",
              "deleted": false
            },
            {
              "_id": "686b9f520b9cfce2fd9d005a",
              "value": "No",
              "deleted": false
            },
            {
              "_id": "686b9f52c544c18cde2ccebe",
              "value": "N/A",
              "deleted": false
            }
          ],
          "file": "686b9f5e6a3471a6915ec932"
        },
        {
          "type": "number",
          "_id": "686ba3174b12b95fc291aa78",
          "identifier": "field_686ba31e7c69061177aa9264",
          "title": "Number",
          "description": "",
          "value": 6,
          "required": false,
          "tipTitle": "",
          "tipDescription": "",
          "tipVisible": false,
          "metadata": {},
          "file": "686b9f5e6a3471a6915ec932"
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bae28bd144c528987b966",
          "type": "multiSelect",
          "title": "Multiple Choice",
          "multi": true,
          "options": [
            {
              "_id": "686bab07001df613def0693b",
              "value": "Yes",
              "deleted": false
            },
            {
              "_id": "686bab07e7af895bee99fa69",
              "value": "No",
              "deleted": false
            },
            {
              "_id": "686bab07055cbb233138b01c",
              "value": "N/A",
              "deleted": false
            }
          ],
          "identifier": "field_686bae2ed119a287637c5e2e",
          "value": [
            "686bab07001df613def0693b",
            "686bab07e7af895bee99fa69"
          ],
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686ba2acc29d6285eca45a4f",
                "condition": "=",
                "value": "686b9f52c544c18cde2ccebe"
              }
            ]
          }
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bae30c91d87ddb0774f34",
          "type": "multiSelect",
          "title": "Single Choice",
          "multi": false,
          "options": [
            {
              "_id": "686bab07c75954e0cbc7f657",
              "value": "Yes",
              "deleted": false
            },
            {
              "_id": "686bab07c0f38e15e6727751",
              "value": "No",
              "deleted": false
            },
            {
              "_id": "686bab075e661ea2d166f135",
              "value": "N/A",
              "deleted": false
            }
          ],
          "identifier": "field_686bae3460f204a4a05f7403",
          "required": true
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bae5dc2a905b0d86253ad",
          "type": "signature",
          "title": "Signature",
          "identifier": "field_686bae654200e2a3cfa0a14a",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686bae30c91d87ddb0774f34",
                "condition": "!=",
                "value": "686bab07c75954e0cbc7f657"
              }
            ]
          }
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bae6697a3bfefc54ce0b8",
          "type": "block",
          "title": "Display Text",
          "value": "Page 2",
          "identifier": "field_686bae75839f8e257a429f46"
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb0d2994b4b02d87ff4e9",
          "type": "text",
          "title": "Text",
          "identifier": "field_686bb0d6ad4871682e062115",
          "hidden": true,
          "value": "jjcjdjcdd"
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb0dd6327c76532808a41",
          "type": "block",
          "title": "Display Text",
          "value": "Display text",
          "identifier": "field_686bb0eee792205c17c4a9f8",
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686bb0d2994b4b02d87ff4e9",
                "condition": "*="
              }
            ]
          },
          "hidden": true
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb1758d69de4785ce98b6",
          "type": "image",
          "title": "Imagejj",
          "identifier": "field_686bb1877fe63bccb8981650"
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb1c1f969d2dc40a6487b",
          "type": "text",
          "title": "Text",
          "identifier": "field_686bb1c786d63e0ae57b5134",
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686b9f5e6068ee4a2f9a6e70",
                "condition": "null="
              },
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686bae5c10f68ba44d49f8c6",
                "field": "686bb25928eff154763184c1",
                "condition": "=",
                "value": "eyooo"
              }
            ]
          }
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb24523bacb2829caa994",
          "type": "block",
          "title": "Heading Text",
          "value": "Heading",
          "identifier": "field_686bb2474ac315933e2bf398",
          "hidden": true
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb25928eff154763184c1",
          "type": "text",
          "title": "Text",
          "identifier": "field_686bb25bfaf41e995a321f0e",
          "value": "eyoo"
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb2b8b98341655093c97a",
          "type": "block",
          "title": "Heading Text",
          "value": "Heading",
          "identifier": "field_686bb2c6e33a18112ee2d3f2"
        },
        {
          "file": "686b9f5e6a3471a6915ec932",
          "_id": "686bb2c6f09bd7e527d4e551",
          "type": "text",
          "title": "Text",
          "identifier": "field_686bb2cb0e4cc7090fd7c025",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686b9f5e39f848b285f3aef6",
                "field": "686b9f5e6068ee4a2f9a6e70",
                "condition": "null="
              },
              {
                "file": "686b9f5e6a3471a6915ec932",
                "page": "686bae5c10f68ba44d49f8c6",
                "field": "686bb25928eff154763184c1",
                "condition": "=",
                "value": "eyooo"
              }
            ]
          }
        }
      ],
      "deleted": false
    }
""".trimIndent()