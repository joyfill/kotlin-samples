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
      "_id": "66a378f217f71205a96a93af",
      "identifier": "doc_66a378f217f71205a96a93af",
      "name": "Test - Jackson",
      "files": [
        {
          "_id": "66a378f2c24a756b26ccd474",
          "name": "Test - Jackson",
          "pageOrder": [
            "66a378f25ac13524d00accf8"
          ],
          "pages": [
            {
              "_id": "66a378f25ac13524d00accf8",
              "name": "New Page",
              "width": 816,
              "height": 1056,
              "rowHeight": 1,
              "cols": 816,
              "fieldPositions": [
                {
                  "_id": "66a37907626142e58e1180b6",
                  "type": "block",
                  "field": "66a378fc71147ef4bf75011d",
                  "displayType": "original",
                  "x": 115.8,
                  "y": 80.74,
                  "width": 156.17,
                  "height": 13.81,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b071d3b0dc8735a62087",
                  "type": "block",
                  "field": "66a3b06d430d122d02152de0",
                  "displayType": "original",
                  "x": 115.8,
                  "y": 91.36,
                  "width": 156.17,
                  "height": 13.81,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b082cc07657297428497",
                  "type": "block",
                  "field": "66a3b07f1c5861cee8dd234e",
                  "displayType": "original",
                  "x": 115.8,
                  "y": 103.05,
                  "width": 155.11,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b136238e830e817d372a",
                  "type": "block",
                  "field": "66a3b133a7c86355f72863de",
                  "displayType": "original",
                  "x": 115.8,
                  "y": 113.67,
                  "width": 155.11,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b1483d2e5d16434db4bb",
                  "type": "block",
                  "field": "66a3b144d7562a5f7732ccc7",
                  "displayType": "original",
                  "x": 115.8,
                  "y": 125.36,
                  "width": 155.11,
                  "height": 13.81,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b166b24e88b8d1fe668d",
                  "type": "block",
                  "field": "66a3b16118a3d1244dcce584",
                  "displayType": "original",
                  "x": 356.96,
                  "y": 80.74,
                  "width": 135.98,
                  "height": 13.81,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b17b074cc5b58fcb43a7",
                  "type": "textarea",
                  "field": "66a3b17595ab5806e714e50c",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 93.49,
                  "width": 135.98,
                  "height": 73.3,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b18efab019b8ac09653f",
                  "type": "text",
                  "field": "66a3b189a0c23aeaf39623d0",
                  "displayType": "original",
                  "x": 638.49,
                  "y": 115.8,
                  "width": 160.42,
                  "height": 12.75,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b213c35d09e059b884ce",
                  "type": "text",
                  "field": "66a3b20f1bfda2ea6bcc99bc",
                  "displayType": "original",
                  "x": 638.49,
                  "y": 126.42,
                  "width": 159.36,
                  "height": 13.81,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b23013620fc54214ee39",
                  "type": "text",
                  "field": "66a3b22f6422516ee96e47ee",
                  "displayType": "original",
                  "x": 638.49,
                  "y": 138.11,
                  "width": 160.42,
                  "height": 12.75,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b24e4b3994657d48a97d",
                  "type": "text",
                  "field": "66a3b24b9ecead71a0d140d9",
                  "displayType": "original",
                  "x": 638.49,
                  "y": 149.79,
                  "width": 159.36,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b6b59d62f33ac532e8bb",
                  "type": "text",
                  "field": "66a3b68601f83c2b5cab89e3",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 410.08,
                  "width": 114.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b6f014e5e64f2d205b36",
                  "type": "text",
                  "field": "66a3b6ed5528c88ed2ae7db6",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 424.95,
                  "width": 114.74,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b715628b8e757c01fa07",
                  "type": "text",
                  "field": "66a3b710e2de6fa2e5955157",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 439.82,
                  "width": 114.74,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3b74954e90f98b4101374",
                  "type": "text",
                  "field": "66a3b7456d3a13d8d5ab278c",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 454.7,
                  "width": 113.67,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bb22dcc89fa28c9bdaee",
                  "type": "text",
                  "field": "66a3bb19026b757d29ecd0dd",
                  "displayType": "original",
                  "x": 184.85,
                  "y": 410.08,
                  "width": 86.05,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bb4b67df580f552c2bde",
                  "type": "text",
                  "field": "66a3bb4530db720d47dfd8ae",
                  "displayType": "original",
                  "x": 185.92,
                  "y": 424.95,
                  "width": 84.99,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bb6300e1dfc89ffea1cf",
                  "type": "text",
                  "field": "66a3bb613a4b62dc8062c6f0",
                  "displayType": "original",
                  "x": 184.85,
                  "y": 439.82,
                  "width": 86.05,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bb7acb879d24f58b870d",
                  "type": "text",
                  "field": "66a3bb777242ecd251a13237",
                  "displayType": "original",
                  "x": 184.85,
                  "y": 454.7,
                  "width": 86.05,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bba4ada9c21eb9fb4cab",
                  "type": "text",
                  "field": "66a3bb8bcf05747ec70efe47",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 410.08,
                  "width": 82.87,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bbcf557d1d8cdbdfb809",
                  "type": "text",
                  "field": "66a3bbcb6676fb9d1ae1b444",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 424.95,
                  "width": 82.87,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bbecd53a34270564a3df",
                  "type": "text",
                  "field": "66a3bbea2c37faaf8fc0d9e3",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 439.82,
                  "width": 82.87,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "66a3bc0da7d9874400cbe23a",
                  "type": "text",
                  "field": "66a3bc0ac242e3e1de6a87c6",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 454.7,
                  "width": 82.87,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f602e0ca8323e199cb8c",
                  "type": "text",
                  "field": "67a5f5f6e8a3cf33d9b13fa2",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 218.85,
                  "width": 114.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f61351cb21395e22d820",
                  "type": "text",
                  "field": "67a5f60f496cbf96408ac6c9",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 233.72,
                  "width": 114.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f61ef843bfd7503d9b6b",
                  "type": "text",
                  "field": "67a5f61df6dcc261a1a49ed5",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 248.6,
                  "width": 114.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6454c6c7fbece715572",
                  "type": "text",
                  "field": "67a5f62a07c2952485a8703c",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 263.47,
                  "width": 114.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f68c049576bccc976674",
                  "type": "text",
                  "field": "67a5f689e5bd6e1c4f3c8a63",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 278.34,
                  "width": 113.67,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f69cb6a1372df2b5f71c",
                  "type": "text",
                  "field": "67a5f69af34263576bdf6c54",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 294.28,
                  "width": 113.67,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6adbeb18be5c2054138",
                  "type": "text",
                  "field": "67a5f6ab5298abb2641a2fec",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 309.15,
                  "width": 114.74,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6bc0ddfa81416ff5f45",
                  "type": "text",
                  "field": "67a5f6ba30228348256cbd18",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 322.96,
                  "width": 114.74,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6ccfad1a3e061d8c004",
                  "type": "text",
                  "field": "67a5f6c92b37182572a89d90",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 338.9,
                  "width": 113.67,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6daa4821abbbbfff231",
                  "type": "text",
                  "field": "67a5f6d77749beef9ed7cb50",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 353.77,
                  "width": 113.67,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6e504503ed10093dbc6",
                  "type": "text",
                  "field": "67a5f6e3c6217370906f1c5c",
                  "displayType": "original",
                  "x": 72.24,
                  "y": 368.64,
                  "width": 114.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6f3845d553d10d6a449",
                  "type": "text",
                  "field": "67a5f6efe2162cc469f356dc",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 218.85,
                  "width": 82.87,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f6ff56616320cc6dba35",
                  "type": "text",
                  "field": "67a5f6fda0fc2ca643b9f720",
                  "displayType": "original",
                  "x": 233.72,
                  "y": 233.72,
                  "width": 83.93,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f70cb394e6aa673f6a18",
                  "type": "text",
                  "field": "67a5f70a94672d8fe81ef83e",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 248.6,
                  "width": 81.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f72a31cad0ee2e949ad7",
                  "type": "text",
                  "field": "67a5f727ab7920ae0d1c7233",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 263.47,
                  "width": 80.74,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f73a25a0fc7728a1a056",
                  "type": "text",
                  "field": "67a5f7383392cda4a440755d",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 278.34,
                  "width": 81.8,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f7496aba8587b7b27ed9",
                  "type": "text",
                  "field": "67a5f746417f3fffac394253",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 294.28,
                  "width": 81.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f75cf7890ef28924b7bc",
                  "type": "text",
                  "field": "67a5f75a009533a5686ef2ae",
                  "displayType": "original",
                  "x": 233.72,
                  "y": 309.15,
                  "width": 82.87,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f77716bff0684c455b68",
                  "type": "text",
                  "field": "67a5f768dce57d63a8705a43",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 322.96,
                  "width": 81.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f783d17acdd9637d2fc8",
                  "type": "text",
                  "field": "67a5f7813441e22497063e32",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 338.9,
                  "width": 81.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f7c51829c237b28a66f7",
                  "type": "text",
                  "field": "67a5f7c06ed33fa11d16059c",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 353.77,
                  "width": 81.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f7d5946ced3a4d167c56",
                  "type": "text",
                  "field": "67a5f7d26579d7f1b1f1f83f",
                  "displayType": "original",
                  "x": 234.78,
                  "y": 368.64,
                  "width": 81.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f7f71c6853972c32d612",
                  "type": "text",
                  "field": "67a5f7e0d82874fc8e3dc783",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 218.85,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f80758a08fdbd2a6fd6c",
                  "type": "text",
                  "field": "67a5f805b9cd00906c1341a8",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 233.72,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f82102e59021306830c3",
                  "type": "text",
                  "field": "67a5f81f6cbde9475554dd04",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 248.6,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f835c7835a6138ee7564",
                  "type": "text",
                  "field": "67a5f830cea9d8618ccb4fca",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 263.47,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f851d40fbbed9d9ba6bf",
                  "type": "text",
                  "field": "67a5f85098be3fb3845ea2de",
                  "displayType": "original",
                  "x": 314.46,
                  "y": 278.34,
                  "width": 43.56,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f85e48310fc12bd47e88",
                  "type": "text",
                  "field": "67a5f85cda4c5790795ff55e",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 293.22,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f86aaaa13e343895fcbf",
                  "type": "text",
                  "field": "67a5f869c90e50fbb2ee0ced",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 309.15,
                  "width": 41.43,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f883029cd63ba4de7870",
                  "type": "text",
                  "field": "67a5f874df6721b697c3cda4",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 322.96,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8915626778eb7d4e2ce",
                  "type": "text",
                  "field": "67a5f88f90dbff0a2996b848",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 338.9,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f89ed1b6dc2cde37a607",
                  "type": "text",
                  "field": "67a5f89c04e04ce12c575047",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 352.71,
                  "width": 41.43,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8af2a857f051bf545c4",
                  "type": "text",
                  "field": "67a5f8adb1180e668b118abb",
                  "displayType": "original",
                  "x": 315.53,
                  "y": 368.64,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8bae27817ad34daf7c5",
                  "type": "text",
                  "field": "67a5f8b83de7eaaf48f2151b",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 218.85,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8c7c96e97556050761c",
                  "type": "text",
                  "field": "67a5f8c5395a4131f11dbac3",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 233.72,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8d26cd3a4eebb1005e7",
                  "type": "text",
                  "field": "67a5f8d15910c207fd0dac2e",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 248.6,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8df2a5534431fb0da4a",
                  "type": "text",
                  "field": "67a5f8dc89c8792b15650974",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 263.47,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8eb63f532674c0455ad",
                  "type": "text",
                  "field": "67a5f8e9d877972420dcd091",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 278.34,
                  "width": 42.49,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f8f72f6b6910ee032844",
                  "type": "text",
                  "field": "67a5f8f5dfe11880af9f07a5",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 293.22,
                  "width": 42.49,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f91427b5c8d40ab66e70",
                  "type": "text",
                  "field": "67a5f900b878509bc70ffc26",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 309.15,
                  "width": 41.43,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f9346828a9eb7078514c",
                  "type": "text",
                  "field": "67a5f932f6c69486a8fb05cd",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 322.96,
                  "width": 42.49,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f943eb3c572b0db16f2e",
                  "type": "text",
                  "field": "67a5f9419e5f2a19fea462a9",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 337.84,
                  "width": 42.49,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5f9547096ea86917e91bc",
                  "type": "text",
                  "field": "67a5f952cd40f1b442fbd2b5",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 353.77,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa2c36d0a05a8574f20e",
                  "type": "text",
                  "field": "67a5f961bfc7ac85fea477e6",
                  "displayType": "original",
                  "x": 355.9,
                  "y": 368.64,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa39e2ae92733978640e",
                  "type": "text",
                  "field": "67a5fa376b780a123bf235c6",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 218.85,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa494868a74c3b22722f",
                  "type": "text",
                  "field": "67a5fa469559cf442ab05172",
                  "displayType": "original",
                  "x": 396.27,
                  "y": 233.72,
                  "width": 43.56,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa56a8b7291d949d45a2",
                  "type": "text",
                  "field": "67a5fa540df72bcd6588657f",
                  "displayType": "original",
                  "x": 396.27,
                  "y": 248.6,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa63c07d768582e46fdc",
                  "type": "text",
                  "field": "67a5fa6194a981bf5fdb651f",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 263.47,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa764eb9c84caf9c3326",
                  "type": "text",
                  "field": "67a5fa726c8fd818f2a1ec62",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 278.34,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fa97f62176906641c129",
                  "type": "text",
                  "field": "67a5fa888db2d1b4671b1d5e",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 294.28,
                  "width": 41.43,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5faa813a2748f904af3fa",
                  "type": "text",
                  "field": "67a5faa65b657eeca8d4aeec",
                  "displayType": "original",
                  "x": 396.27,
                  "y": 309.15,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fabcb91cfbadf6141824",
                  "type": "text",
                  "field": "67a5fab8e55aa607873d5011",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 322.96,
                  "width": 42.49,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5facc5d383f0ff48ca946",
                  "type": "text",
                  "field": "67a5fac97ea6b5f44fc1c06b",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 338.9,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fadbd9e1fb2c6d28401a",
                  "type": "text",
                  "field": "67a5fad804c5a4fb1156f845",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 353.77,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5faeb0b0a865c77768dc7",
                  "type": "text",
                  "field": "67a5fae9ce3d10bf6eee3c71",
                  "displayType": "original",
                  "x": 397.33,
                  "y": 368.64,
                  "width": 42.49,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fb474f1396248a204c9d",
                  "type": "text",
                  "field": "67a5fafb6c9a859024a26338",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 218.85,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fb561eaa7e9de90bd524",
                  "type": "text",
                  "field": "67a5fb5497ecd36c47955e33",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 233.72,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fb627c5a80214dcdfca7",
                  "type": "text",
                  "field": "67a5fb607d5b86df72219995",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 248.6,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fb71bcb2d9ba24f68e0b",
                  "type": "text",
                  "field": "67a5fb6e9df881346e22f3ed",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 263.47,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fb82110b02ca8d2e0d19",
                  "type": "text",
                  "field": "67a5fb8015fec7b6d407d8c7",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 278.34,
                  "width": 55.24,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fb8f9131cc6d12d90dab",
                  "type": "text",
                  "field": "67a5fb8ca4a457ffef073c6c",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 294.28,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fba1c161f0a6fc48a9f1",
                  "type": "text",
                  "field": "67a5fb9f095ada06b46df85a",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 309.15,
                  "width": 55.24,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fbb23014a17703f7b6c8",
                  "type": "text",
                  "field": "67a5fbb04339a4c663ba6975",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 324.02,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fbdf3b005388459351dd",
                  "type": "text",
                  "field": "67a5fbc1dbf3e0304491ca6c",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 338.9,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fbee7dc9d1937a0b96a7",
                  "type": "text",
                  "field": "67a5fbecac943aeada3801e0",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 353.77,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fc2f0175b8fe0b8e8788",
                  "type": "text",
                  "field": "67a5fc2c06793cc8024df0ff",
                  "displayType": "original",
                  "x": 437.7,
                  "y": 368.64,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fd3fd4340ef34e3dfae4",
                  "type": "text",
                  "field": "67a5fc5aebce7bf097e6f273",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 218.85,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fd53ec759f9bc4353eb9",
                  "type": "text",
                  "field": "67a5fd4ed681b8a0814a63cf",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 233.72,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ff64de4f76237ab60abf",
                  "type": "text",
                  "field": "67a5fd5e1145494b319c102c",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 248.6,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ff84850d1dac8545ebf3",
                  "type": "text",
                  "field": "67a5ff822ee8274d2ecbdc59",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 263.47,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ff90d0b445c65cdb4363",
                  "type": "text",
                  "field": "67a5ff8ebd34f3f827057e5f",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 278.34,
                  "width": 56.31,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ff9ed366b32b8f8fe1f1",
                  "type": "text",
                  "field": "67a5ff9c90c1e94d49764a2e",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 294.28,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ffb4bf072c21ba6b6a89",
                  "type": "text",
                  "field": "67a5ffab700501d542d06aec",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 309.15,
                  "width": 56.31,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ffc4972c975ae2a02737",
                  "type": "text",
                  "field": "67a5ffc205ef34a5c938254c",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 322.96,
                  "width": 56.31,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ffd586d443fa8d8a8b53",
                  "type": "text",
                  "field": "67a5ffd37a1222eee318b8e5",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 338.9,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5ffe72dcfab2266360262",
                  "type": "text",
                  "field": "67a5ffe56b8f3a2a6784689d",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 353.77,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a5fff8b871dd0ca2308ae4",
                  "type": "text",
                  "field": "67a5fff5689aedb8122b3251",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 368.64,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6003984510a0f58783c8d",
                  "type": "text",
                  "field": "67a60036781e672996fccfe1",
                  "displayType": "original",
                  "x": 545,
                  "y": 218.85,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6004ac8879b6789fe3b97",
                  "type": "text",
                  "field": "67a60047f621cb47d4756a73",
                  "displayType": "original",
                  "x": 545,
                  "y": 233.72,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6005ab804656a6e0bd677",
                  "type": "text",
                  "field": "67a60058175fbab893fc0c66",
                  "displayType": "original",
                  "x": 545,
                  "y": 248.6,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6006d820c677123e5f52b",
                  "type": "text",
                  "field": "67a6006bb02c2cfede01de20",
                  "displayType": "original",
                  "x": 545,
                  "y": 263.47,
                  "width": 55.24,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6007f7f1977640e98caad",
                  "type": "text",
                  "field": "67a6007c6aad66526f9a1c9e",
                  "displayType": "original",
                  "x": 543.94,
                  "y": 278.34,
                  "width": 56.31,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6009c8082576e7af5f2fd",
                  "type": "text",
                  "field": "67a60090249a577859e0ee67",
                  "displayType": "original",
                  "x": 543.94,
                  "y": 294.28,
                  "width": 56.31,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a600ab17718ee8cfb5c5bd",
                  "type": "text",
                  "field": "67a600a955b4afd5cdf6a481",
                  "displayType": "original",
                  "x": 545,
                  "y": 309.15,
                  "width": 54.18,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a600c5f162e4d0bbe06e55",
                  "type": "text",
                  "field": "67a600c33623023a630bc21c",
                  "displayType": "original",
                  "x": 545,
                  "y": 324.02,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a601e018ab2f82eb9f9234",
                  "type": "text",
                  "field": "67a600d346a564f0cc813173",
                  "displayType": "original",
                  "x": 545,
                  "y": 338.9,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a601ef34839b994af4dbcb",
                  "type": "text",
                  "field": "67a601ecb4a9140acf57f625",
                  "displayType": "original",
                  "x": 545,
                  "y": 353.77,
                  "width": 55.24,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a602110333bbe1005200ad",
                  "type": "text",
                  "field": "67a6020f5d884786e0628949",
                  "displayType": "original",
                  "x": 545,
                  "y": 368.64,
                  "width": 54.18,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a602453e85c5872cc0d883",
                  "type": "text",
                  "field": "67a6023f6f13054216caf82e",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 218.85,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6025413d2a04183d63a4c",
                  "type": "text",
                  "field": "67a602523d2cc9cf7d1d250b",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 233.72,
                  "width": 199.73,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a602bc1aa114d4ac391382",
                  "type": "text",
                  "field": "67a60261fc53b3406b7dd6bc",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 248.6,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a602db4f00cb3734b12f26",
                  "type": "text",
                  "field": "67a602d8f51659162bc8118c",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 263.47,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a602ef8955d13d2763602a",
                  "type": "text",
                  "field": "67a602ed0579f6789600b08a",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 278.34,
                  "width": 199.73,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a603018ee94b643679ae33",
                  "type": "text",
                  "field": "67a602fe19217176a9aa90a9",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 294.28,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6031307592fedb3330213",
                  "type": "text",
                  "field": "67a603112204d5f29769d0e7",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 309.15,
                  "width": 200.79,
                  "height": 14.87,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6032de34645f941fbd733",
                  "type": "text",
                  "field": "67a6032a0054be0232d7951b",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 322.96,
                  "width": 199.73,
                  "height": 17,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6033e3a7942a5f5a32ca6",
                  "type": "text",
                  "field": "67a6033cb233d9c220322364",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 338.9,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6034fedad31ce57ed39cc",
                  "type": "text",
                  "field": "67a6034d049b8364159f1839",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 353.77,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6035d8fe4ee110c702560",
                  "type": "text",
                  "field": "67a6035be5dedf7298daa33b",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 368.64,
                  "width": 199.73,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6036d911bfd0df77ec771",
                  "type": "text",
                  "field": "67a6036a3e10b9e438c9f108",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 424.95,
                  "width": 109.42,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6037b9d0c0e8791a53d13",
                  "type": "text",
                  "field": "67a60379f53122fe9da96aeb",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 424.95,
                  "width": 132.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a603889d3e36f65e9accb0",
                  "type": "text",
                  "field": "67a60385067dfe9560697bb1",
                  "displayType": "original",
                  "x": 729.85,
                  "y": 424.95,
                  "width": 69.05,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a6039358e8934492400c88",
                  "type": "text",
                  "field": "67a6039167d791ca40b57624",
                  "displayType": "original",
                  "x": 490.82,
                  "y": 439.82,
                  "width": 109.42,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a603a16b28a91bc46a536e",
                  "type": "text",
                  "field": "67a6039e3da2d4607be3bfa2",
                  "displayType": "original",
                  "x": 598.12,
                  "y": 439.82,
                  "width": 132.8,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67a619acd2f8734c0168461d",
                  "type": "text",
                  "field": "67a603b05f0fbc345f38ca94",
                  "displayType": "original",
                  "x": 728.79,
                  "y": 439.82,
                  "width": 67.99,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67ac76ff26fe5f8c501f5000",
                  "type": "multiSelect",
                  "field": "67ac76fdcdf221789575314c",
                  "displayType": "check",
                  "targetValue": "67ac6a6b835b150c0b965b97",
                  "x": 184.85,
                  "y": 149.79,
                  "width": 34,
                  "height": 15.94,
                  "titleDisplay": "none"
                },
                {
                  "_id": "67ac7729bf93ce2fc8e3d8c1",
                  "type": "multiSelect",
                  "field": "67ac77230af8f7532ad28ea3",
                  "displayType": "check",
                  "targetValue": "67ac6a6b835b150c0b965b97",
                  "x": 234.78,
                  "y": 149.79,
                  "width": 35.06,
                  "height": 15.94,
                  "titleDisplay": "none"
                }
              ],
              "layout": "float",
              "presentation": "transparent",
              "backgroundImage": "https://twiddle.onuptick.com/wfgb/jacksonfire/joyfill_forms/images/73364d3c-f2a8-405e-8e71-feaf8a4fd4f2/7695a0a0-8d7a-46a1-9d99-ace49a1e12f9.png?transform=crop%3Dfill%3Bmedia%3Dmedia-gb%3Bsign%3DTrue&Expires=32503680000&Signature=ZEoM-F87n19PxDM93V7N2t6rdoO2fu-Qyu4iMVbH2WYtG~Rub68SHzyxSE9xocwThE5mfVR0xAqLshpegRUUlV8h~gVeeo~lDMcii76CJQHp9CzGxz50~jel~rmCxV5lQIQ-SNIBTBWTpMpSaqYm-D4RnIS8wkJqUJ52zplyTLUq09U6O0HFbst8kfR~wXsm6Bl2XYp~4DcDLoNfzPLSAvNL9YQSpN2t3X2tc73pcqwRjvjMKMwSYF4T-lBZQjDv7sTGv2oh80kcBmZrsFMRgqESRTHNe9QTIYi8tF5FwFt6qWg4KsLfhiaz45f~jVpkALEcyuGJ~MYTs4kinMIdzA__&Key-Pair-Id=KBIRTB6I7YMSH",
              "filePath": "joyfill_forms/images/73364d3c-f2a8-405e-8e71-feaf8a4fd4f2/",
              "fileName": "7695a0a0-8d7a-46a1-9d99-ace49a1e12f9.png"
            }
          ],
          "views": [
            {
              "_id": "67acaf91a717d45f6e52ebf8",
              "type": "mobile",
              "pages": [
                {
                  "_id": "66a378f25ac13524d00accf8",
                  "name": "New Page",
                  "width": 816,
                  "height": 1056,
                  "rowHeight": 1,
                  "cols": 1,
                  "fieldPositions": [
                    {
                      "_id": "66a3b17b074cc5b58fcb43a7",
                      "type": "textarea",
                      "field": "66a3b17595ab5806e714e50c",
                      "displayType": "original",
                      "x": 0,
                      "y": 446,
                      "width": 1,
                      "height": 180,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b18efab019b8ac09653f",
                      "type": "text",
                      "field": "66a3b189a0c23aeaf39623d0",
                      "displayType": "original",
                      "x": 0,
                      "y": 830,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b213c35d09e059b884ce",
                      "type": "text",
                      "field": "66a3b20f1bfda2ea6bcc99bc",
                      "displayType": "original",
                      "x": 0,
                      "y": 894,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b23013620fc54214ee39",
                      "type": "text",
                      "field": "66a3b22f6422516ee96e47ee",
                      "displayType": "original",
                      "x": 0,
                      "y": 958,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67ac76ff26fe5f8c501f5000",
                      "type": "multiSelect",
                      "field": "67ac76fdcdf221789575314c",
                      "displayType": "original",
                      "targetValue": "67ac6a6b835b150c0b965b97",
                      "x": 0,
                      "y": 666,
                      "width": 1,
                      "height": 86,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67ac7729bf93ce2fc8e3d8c1",
                      "type": "multiSelect",
                      "field": "67ac77230af8f7532ad28ea3",
                      "displayType": "original",
                      "targetValue": "67ac6a6b835b150c0b965b97",
                      "x": 0,
                      "y": 752,
                      "width": 1,
                      "height": 78,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b24e4b3994657d48a97d",
                      "type": "text",
                      "field": "66a3b24b9ecead71a0d140d9",
                      "displayType": "original",
                      "x": 0,
                      "y": 1022,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f602e0ca8323e199cb8c",
                      "type": "text",
                      "field": "67a5f5f6e8a3cf33d9b13fa2",
                      "displayType": "original",
                      "x": 0,
                      "y": 1308,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6f3845d553d10d6a449",
                      "type": "text",
                      "field": "67a5f6efe2162cc469f356dc",
                      "displayType": "original",
                      "x": 0,
                      "y": 1412,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f7f71c6853972c32d612",
                      "type": "text",
                      "field": "67a5f7e0d82874fc8e3dc783",
                      "displayType": "original",
                      "x": 0,
                      "y": 1516,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8bae27817ad34daf7c5",
                      "type": "text",
                      "field": "67a5f8b83de7eaaf48f2151b",
                      "displayType": "original",
                      "x": 0,
                      "y": 1580,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa39e2ae92733978640e",
                      "type": "text",
                      "field": "67a5fa376b780a123bf235c6",
                      "displayType": "original",
                      "x": 0,
                      "y": 1644,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fb474f1396248a204c9d",
                      "type": "text",
                      "field": "67a5fafb6c9a859024a26338",
                      "displayType": "original",
                      "x": 0,
                      "y": 1748,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fd3fd4340ef34e3dfae4",
                      "type": "text",
                      "field": "67a5fc5aebce7bf097e6f273",
                      "displayType": "original",
                      "x": 0,
                      "y": 1812,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6003984510a0f58783c8d",
                      "type": "text",
                      "field": "67a60036781e672996fccfe1",
                      "displayType": "original",
                      "x": 0,
                      "y": 1876,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a602453e85c5872cc0d883",
                      "type": "text",
                      "field": "67a6023f6f13054216caf82e",
                      "displayType": "original",
                      "x": 0,
                      "y": 1940,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f61351cb21395e22d820",
                      "type": "text",
                      "field": "67a5f60f496cbf96408ac6c9",
                      "displayType": "original",
                      "x": 0,
                      "y": 2044,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6ff56616320cc6dba35",
                      "type": "text",
                      "field": "67a5f6fda0fc2ca643b9f720",
                      "displayType": "original",
                      "x": 0,
                      "y": 2148,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f80758a08fdbd2a6fd6c",
                      "type": "text",
                      "field": "67a5f805b9cd00906c1341a8",
                      "displayType": "original",
                      "x": 0,
                      "y": 2252,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8c7c96e97556050761c",
                      "type": "text",
                      "field": "67a5f8c5395a4131f11dbac3",
                      "displayType": "original",
                      "x": 0,
                      "y": 2316,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa494868a74c3b22722f",
                      "type": "text",
                      "field": "67a5fa469559cf442ab05172",
                      "displayType": "original",
                      "x": 0,
                      "y": 2380,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fb561eaa7e9de90bd524",
                      "type": "text",
                      "field": "67a5fb5497ecd36c47955e33",
                      "displayType": "original",
                      "x": 0,
                      "y": 2484,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fd53ec759f9bc4353eb9",
                      "type": "text",
                      "field": "67a5fd4ed681b8a0814a63cf",
                      "displayType": "original",
                      "x": 0,
                      "y": 2548,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6004ac8879b6789fe3b97",
                      "type": "text",
                      "field": "67a60047f621cb47d4756a73",
                      "displayType": "original",
                      "x": 0,
                      "y": 2612,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6025413d2a04183d63a4c",
                      "type": "text",
                      "field": "67a602523d2cc9cf7d1d250b",
                      "displayType": "original",
                      "x": 0,
                      "y": 2676,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f61ef843bfd7503d9b6b",
                      "type": "text",
                      "field": "67a5f61df6dcc261a1a49ed5",
                      "displayType": "original",
                      "x": 0,
                      "y": 2780,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f70cb394e6aa673f6a18",
                      "type": "text",
                      "field": "67a5f70a94672d8fe81ef83e",
                      "displayType": "original",
                      "x": 0,
                      "y": 2884,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f82102e59021306830c3",
                      "type": "text",
                      "field": "67a5f81f6cbde9475554dd04",
                      "displayType": "original",
                      "x": 0,
                      "y": 2988,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8d26cd3a4eebb1005e7",
                      "type": "text",
                      "field": "67a5f8d15910c207fd0dac2e",
                      "displayType": "original",
                      "x": 0,
                      "y": 3052,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa56a8b7291d949d45a2",
                      "type": "text",
                      "field": "67a5fa540df72bcd6588657f",
                      "displayType": "original",
                      "x": 0,
                      "y": 3116,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fb627c5a80214dcdfca7",
                      "type": "text",
                      "field": "67a5fb607d5b86df72219995",
                      "displayType": "original",
                      "x": 0,
                      "y": 3220,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ff64de4f76237ab60abf",
                      "type": "text",
                      "field": "67a5fd5e1145494b319c102c",
                      "displayType": "original",
                      "x": 0,
                      "y": 3284,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6005ab804656a6e0bd677",
                      "type": "text",
                      "field": "67a60058175fbab893fc0c66",
                      "displayType": "original",
                      "x": 0,
                      "y": 3348,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a602bc1aa114d4ac391382",
                      "type": "text",
                      "field": "67a60261fc53b3406b7dd6bc",
                      "displayType": "original",
                      "x": 0,
                      "y": 3412,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6454c6c7fbece715572",
                      "type": "text",
                      "field": "67a5f62a07c2952485a8703c",
                      "displayType": "original",
                      "x": 0,
                      "y": 3516,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f72a31cad0ee2e949ad7",
                      "type": "text",
                      "field": "67a5f727ab7920ae0d1c7233",
                      "displayType": "original",
                      "x": 0,
                      "y": 3620,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f835c7835a6138ee7564",
                      "type": "text",
                      "field": "67a5f830cea9d8618ccb4fca",
                      "displayType": "original",
                      "x": 0,
                      "y": 3724,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8df2a5534431fb0da4a",
                      "type": "text",
                      "field": "67a5f8dc89c8792b15650974",
                      "displayType": "original",
                      "x": 0,
                      "y": 3788,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa63c07d768582e46fdc",
                      "type": "text",
                      "field": "67a5fa6194a981bf5fdb651f",
                      "displayType": "original",
                      "x": 0,
                      "y": 3852,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fb71bcb2d9ba24f68e0b",
                      "type": "text",
                      "field": "67a5fb6e9df881346e22f3ed",
                      "displayType": "original",
                      "x": 0,
                      "y": 3956,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ff84850d1dac8545ebf3",
                      "type": "text",
                      "field": "67a5ff822ee8274d2ecbdc59",
                      "displayType": "original",
                      "x": 0,
                      "y": 4020,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6006d820c677123e5f52b",
                      "type": "text",
                      "field": "67a6006bb02c2cfede01de20",
                      "displayType": "original",
                      "x": 0,
                      "y": 4084,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a602db4f00cb3734b12f26",
                      "type": "text",
                      "field": "67a602d8f51659162bc8118c",
                      "displayType": "original",
                      "x": 0,
                      "y": 4148,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f68c049576bccc976674",
                      "type": "text",
                      "field": "67a5f689e5bd6e1c4f3c8a63",
                      "displayType": "original",
                      "x": 0,
                      "y": 4252,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f73a25a0fc7728a1a056",
                      "type": "text",
                      "field": "67a5f7383392cda4a440755d",
                      "displayType": "original",
                      "x": 0,
                      "y": 4356,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f851d40fbbed9d9ba6bf",
                      "type": "text",
                      "field": "67a5f85098be3fb3845ea2de",
                      "displayType": "original",
                      "x": 0,
                      "y": 4460,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8eb63f532674c0455ad",
                      "type": "text",
                      "field": "67a5f8e9d877972420dcd091",
                      "displayType": "original",
                      "x": 0,
                      "y": 4524,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa764eb9c84caf9c3326",
                      "type": "text",
                      "field": "67a5fa726c8fd818f2a1ec62",
                      "displayType": "original",
                      "x": 0,
                      "y": 4588,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fb82110b02ca8d2e0d19",
                      "type": "text",
                      "field": "67a5fb8015fec7b6d407d8c7",
                      "displayType": "original",
                      "x": 0,
                      "y": 4692,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ff90d0b445c65cdb4363",
                      "type": "text",
                      "field": "67a5ff8ebd34f3f827057e5f",
                      "displayType": "original",
                      "x": 0,
                      "y": 4756,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6007f7f1977640e98caad",
                      "type": "text",
                      "field": "67a6007c6aad66526f9a1c9e",
                      "displayType": "original",
                      "x": 0,
                      "y": 4820,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a602ef8955d13d2763602a",
                      "type": "text",
                      "field": "67a602ed0579f6789600b08a",
                      "displayType": "original",
                      "x": 0,
                      "y": 4884,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f85e48310fc12bd47e88",
                      "type": "text",
                      "field": "67a5f85cda4c5790795ff55e",
                      "displayType": "original",
                      "x": 0,
                      "y": 5196,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8f72f6b6910ee032844",
                      "type": "text",
                      "field": "67a5f8f5dfe11880af9f07a5",
                      "displayType": "original",
                      "x": 0,
                      "y": 5260,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f69cb6a1372df2b5f71c",
                      "type": "text",
                      "field": "67a5f69af34263576bdf6c54",
                      "displayType": "original",
                      "x": 0,
                      "y": 4988,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f7496aba8587b7b27ed9",
                      "type": "text",
                      "field": "67a5f746417f3fffac394253",
                      "displayType": "original",
                      "x": 0,
                      "y": 5092,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa97f62176906641c129",
                      "type": "text",
                      "field": "67a5fa888db2d1b4671b1d5e",
                      "displayType": "original",
                      "x": 0,
                      "y": 5324,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fb8f9131cc6d12d90dab",
                      "type": "text",
                      "field": "67a5fb8ca4a457ffef073c6c",
                      "displayType": "original",
                      "x": 0,
                      "y": 5428,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ff9ed366b32b8f8fe1f1",
                      "type": "text",
                      "field": "67a5ff9c90c1e94d49764a2e",
                      "displayType": "original",
                      "x": 0,
                      "y": 5492,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6009c8082576e7af5f2fd",
                      "type": "text",
                      "field": "67a60090249a577859e0ee67",
                      "displayType": "original",
                      "x": 0,
                      "y": 5556,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a603018ee94b643679ae33",
                      "type": "text",
                      "field": "67a602fe19217176a9aa90a9",
                      "displayType": "original",
                      "x": 0,
                      "y": 5620,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6adbeb18be5c2054138",
                      "type": "text",
                      "field": "67a5f6ab5298abb2641a2fec",
                      "displayType": "original",
                      "x": 0,
                      "y": 5724,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f75cf7890ef28924b7bc",
                      "type": "text",
                      "field": "67a5f75a009533a5686ef2ae",
                      "displayType": "original",
                      "x": 0,
                      "y": 5828,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f86aaaa13e343895fcbf",
                      "type": "text",
                      "field": "67a5f869c90e50fbb2ee0ced",
                      "displayType": "original",
                      "x": 0,
                      "y": 5932,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f91427b5c8d40ab66e70",
                      "type": "text",
                      "field": "67a5f900b878509bc70ffc26",
                      "displayType": "original",
                      "x": 0,
                      "y": 5996,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5faa813a2748f904af3fa",
                      "type": "text",
                      "field": "67a5faa65b657eeca8d4aeec",
                      "displayType": "original",
                      "x": 0,
                      "y": 6060,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fba1c161f0a6fc48a9f1",
                      "type": "text",
                      "field": "67a5fb9f095ada06b46df85a",
                      "displayType": "original",
                      "x": 0,
                      "y": 6164,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ffb4bf072c21ba6b6a89",
                      "type": "text",
                      "field": "67a5ffab700501d542d06aec",
                      "displayType": "original",
                      "x": 0,
                      "y": 6228,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a600ab17718ee8cfb5c5bd",
                      "type": "text",
                      "field": "67a600a955b4afd5cdf6a481",
                      "displayType": "original",
                      "x": 0,
                      "y": 6292,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6031307592fedb3330213",
                      "type": "text",
                      "field": "67a603112204d5f29769d0e7",
                      "displayType": "original",
                      "x": 0,
                      "y": 6356,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6bc0ddfa81416ff5f45",
                      "type": "text",
                      "field": "67a5f6ba30228348256cbd18",
                      "displayType": "original",
                      "x": 0,
                      "y": 6460,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f77716bff0684c455b68",
                      "type": "text",
                      "field": "67a5f768dce57d63a8705a43",
                      "displayType": "original",
                      "x": 0,
                      "y": 6564,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f883029cd63ba4de7870",
                      "type": "text",
                      "field": "67a5f874df6721b697c3cda4",
                      "displayType": "original",
                      "x": 0,
                      "y": 6668,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f9346828a9eb7078514c",
                      "type": "text",
                      "field": "67a5f932f6c69486a8fb05cd",
                      "displayType": "original",
                      "x": 0,
                      "y": 6732,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fabcb91cfbadf6141824",
                      "type": "text",
                      "field": "67a5fab8e55aa607873d5011",
                      "displayType": "original",
                      "x": 0,
                      "y": 6796,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ffc4972c975ae2a02737",
                      "type": "text",
                      "field": "67a5ffc205ef34a5c938254c",
                      "displayType": "original",
                      "x": 0,
                      "y": 6964,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6032de34645f941fbd733",
                      "type": "text",
                      "field": "67a6032a0054be0232d7951b",
                      "displayType": "original",
                      "x": 0,
                      "y": 7092,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fbb23014a17703f7b6c8",
                      "type": "text",
                      "field": "67a5fbb04339a4c663ba6975",
                      "displayType": "original",
                      "x": 0,
                      "y": 6900,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a600c5f162e4d0bbe06e55",
                      "type": "text",
                      "field": "67a600c33623023a630bc21c",
                      "displayType": "original",
                      "x": 0,
                      "y": 7028,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f943eb3c572b0db16f2e",
                      "type": "text",
                      "field": "67a5f9419e5f2a19fea462a9",
                      "displayType": "original",
                      "x": 0,
                      "y": 7468,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6ccfad1a3e061d8c004",
                      "type": "text",
                      "field": "67a5f6c92b37182572a89d90",
                      "displayType": "original",
                      "x": 0,
                      "y": 7196,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f783d17acdd9637d2fc8",
                      "type": "text",
                      "field": "67a5f7813441e22497063e32",
                      "displayType": "original",
                      "x": 0,
                      "y": 7300,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8915626778eb7d4e2ce",
                      "type": "text",
                      "field": "67a5f88f90dbff0a2996b848",
                      "displayType": "original",
                      "x": 0,
                      "y": 7404,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5facc5d383f0ff48ca946",
                      "type": "text",
                      "field": "67a5fac97ea6b5f44fc1c06b",
                      "displayType": "original",
                      "x": 0,
                      "y": 7532,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fbdf3b005388459351dd",
                      "type": "text",
                      "field": "67a5fbc1dbf3e0304491ca6c",
                      "displayType": "original",
                      "x": 0,
                      "y": 7636,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ffd586d443fa8d8a8b53",
                      "type": "text",
                      "field": "67a5ffd37a1222eee318b8e5",
                      "displayType": "original",
                      "x": 0,
                      "y": 7700,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a601e018ab2f82eb9f9234",
                      "type": "text",
                      "field": "67a600d346a564f0cc813173",
                      "displayType": "original",
                      "x": 0,
                      "y": 7764,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6033e3a7942a5f5a32ca6",
                      "type": "text",
                      "field": "67a6033cb233d9c220322364",
                      "displayType": "original",
                      "x": 0,
                      "y": 7828,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f89ed1b6dc2cde37a607",
                      "type": "text",
                      "field": "67a5f89c04e04ce12c575047",
                      "displayType": "original",
                      "x": 0,
                      "y": 8140,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6daa4821abbbbfff231",
                      "type": "text",
                      "field": "67a5f6d77749beef9ed7cb50",
                      "displayType": "original",
                      "x": 0,
                      "y": 7932,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f7c51829c237b28a66f7",
                      "type": "text",
                      "field": "67a5f7c06ed33fa11d16059c",
                      "displayType": "original",
                      "x": 0,
                      "y": 8036,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f9547096ea86917e91bc",
                      "type": "text",
                      "field": "67a5f952cd40f1b442fbd2b5",
                      "displayType": "original",
                      "x": 0,
                      "y": 8204,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fadbd9e1fb2c6d28401a",
                      "type": "text",
                      "field": "67a5fad804c5a4fb1156f845",
                      "displayType": "original",
                      "x": 0,
                      "y": 8268,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fbee7dc9d1937a0b96a7",
                      "type": "text",
                      "field": "67a5fbecac943aeada3801e0",
                      "displayType": "original",
                      "x": 0,
                      "y": 8372,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5ffe72dcfab2266360262",
                      "type": "text",
                      "field": "67a5ffe56b8f3a2a6784689d",
                      "displayType": "original",
                      "x": 0,
                      "y": 8436,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a601ef34839b994af4dbcb",
                      "type": "text",
                      "field": "67a601ecb4a9140acf57f625",
                      "displayType": "original",
                      "x": 0,
                      "y": 8500,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6034fedad31ce57ed39cc",
                      "type": "text",
                      "field": "67a6034d049b8364159f1839",
                      "displayType": "original",
                      "x": 0,
                      "y": 8564,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f6e504503ed10093dbc6",
                      "type": "text",
                      "field": "67a5f6e3c6217370906f1c5c",
                      "displayType": "original",
                      "x": 0,
                      "y": 8668,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f7d5946ced3a4d167c56",
                      "type": "text",
                      "field": "67a5f7d26579d7f1b1f1f83f",
                      "displayType": "original",
                      "x": 0,
                      "y": 8772,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5f8af2a857f051bf545c4",
                      "type": "text",
                      "field": "67a5f8adb1180e668b118abb",
                      "displayType": "original",
                      "x": 0,
                      "y": 8876,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fa2c36d0a05a8574f20e",
                      "type": "text",
                      "field": "67a5f961bfc7ac85fea477e6",
                      "displayType": "original",
                      "x": 0,
                      "y": 8940,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5faeb0b0a865c77768dc7",
                      "type": "text",
                      "field": "67a5fae9ce3d10bf6eee3c71",
                      "displayType": "original",
                      "x": 0,
                      "y": 9004,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fc2f0175b8fe0b8e8788",
                      "type": "text",
                      "field": "67a5fc2c06793cc8024df0ff",
                      "displayType": "original",
                      "x": 0,
                      "y": 9108,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a5fff8b871dd0ca2308ae4",
                      "type": "text",
                      "field": "67a5fff5689aedb8122b3251",
                      "displayType": "original",
                      "x": 0,
                      "y": 9172,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a602110333bbe1005200ad",
                      "type": "text",
                      "field": "67a6020f5d884786e0628949",
                      "displayType": "original",
                      "x": 0,
                      "y": 9236,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6035d8fe4ee110c702560",
                      "type": "text",
                      "field": "67a6035be5dedf7298daa33b",
                      "displayType": "original",
                      "x": 0,
                      "y": 9300,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b6b59d62f33ac532e8bb",
                      "type": "text",
                      "field": "66a3b68601f83c2b5cab89e3",
                      "displayType": "original",
                      "x": 0,
                      "y": 9404,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bb22dcc89fa28c9bdaee",
                      "type": "text",
                      "field": "66a3bb19026b757d29ecd0dd",
                      "displayType": "original",
                      "x": 0,
                      "y": 9468,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bba4ada9c21eb9fb4cab",
                      "type": "text",
                      "field": "66a3bb8bcf05747ec70efe47",
                      "displayType": "original",
                      "x": 0,
                      "y": 9916,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b6f014e5e64f2d205b36",
                      "type": "text",
                      "field": "66a3b6ed5528c88ed2ae7db6",
                      "displayType": "original",
                      "x": 0,
                      "y": 9532,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bb4b67df580f552c2bde",
                      "type": "text",
                      "field": "66a3bb4530db720d47dfd8ae",
                      "displayType": "original",
                      "x": 0,
                      "y": 9596,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bbcf557d1d8cdbdfb809",
                      "type": "text",
                      "field": "66a3bbcb6676fb9d1ae1b444",
                      "displayType": "original",
                      "x": 0,
                      "y": 9980,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6036d911bfd0df77ec771",
                      "type": "text",
                      "field": "67a6036a3e10b9e438c9f108",
                      "displayType": "original",
                      "x": 0,
                      "y": 10335,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6037b9d0c0e8791a53d13",
                      "type": "text",
                      "field": "67a60379f53122fe9da96aeb",
                      "displayType": "original",
                      "x": 0,
                      "y": 10399,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a603889d3e36f65e9accb0",
                      "type": "text",
                      "field": "67a60385067dfe9560697bb1",
                      "displayType": "original",
                      "x": 0,
                      "y": 10463,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b715628b8e757c01fa07",
                      "type": "text",
                      "field": "66a3b710e2de6fa2e5955157",
                      "displayType": "original",
                      "x": 0,
                      "y": 9660,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bb6300e1dfc89ffea1cf",
                      "type": "text",
                      "field": "66a3bb613a4b62dc8062c6f0",
                      "displayType": "original",
                      "x": 0,
                      "y": 9724,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bbecd53a34270564a3df",
                      "type": "text",
                      "field": "66a3bbea2c37faaf8fc0d9e3",
                      "displayType": "original",
                      "x": 0,
                      "y": 10044,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a6039358e8934492400c88",
                      "type": "text",
                      "field": "67a6039167d791ca40b57624",
                      "displayType": "original",
                      "x": 0,
                      "y": 10527,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a603a16b28a91bc46a536e",
                      "type": "text",
                      "field": "67a6039e3da2d4607be3bfa2",
                      "displayType": "original",
                      "x": 0,
                      "y": 10591,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67a619acd2f8734c0168461d",
                      "type": "text",
                      "field": "67a603b05f0fbc345f38ca94",
                      "displayType": "original",
                      "x": 0,
                      "y": 10655,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3b74954e90f98b4101374",
                      "type": "text",
                      "field": "66a3b7456d3a13d8d5ab278c",
                      "displayType": "original",
                      "x": 0,
                      "y": 9788,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bb7acb879d24f58b870d",
                      "type": "text",
                      "field": "66a3bb777242ecd251a13237",
                      "displayType": "original",
                      "x": 0,
                      "y": 9852,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "66a3bc0da7d9874400cbe23a",
                      "type": "text",
                      "field": "66a3bc0ac242e3e1de6a87c6",
                      "displayType": "original",
                      "x": 0,
                      "y": 10108,
                      "width": 1,
                      "height": 64,
                      "titleDisplay": "inline"
                    },
                    {
                      "_id": "67acaf9549c09a9eac80bae7",
                      "type": "block",
                      "field": "67acaf918f62117488eed759",
                      "displayType": "original",
                      "x": 0,
                      "y": 0,
                      "width": 1,
                      "height": 62,
                      "fontSize": 20,
                      "fontColor": "#ff0000",
                      "fontWeight": "bold"
                    },
                    {
                      "_id": "67acaffe9c901177aae7aa05",
                      "type": "block",
                      "field": "67acaff9699047329cd8fda8",
                      "displayType": "original",
                      "x": 0,
                      "y": 626,
                      "width": 1,
                      "height": 40,
                      "fontSize": 20,
                      "fontColor": "#ff0000",
                      "fontWeight": "bold"
                    },
                    {
                      "_id": "67acbb8995d56415f3fcb8bc",
                      "type": "block",
                      "field": "67acbb833449e6dfa73b542f",
                      "displayType": "original",
                      "x": 0,
                      "y": 1372,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acbba7ce837e19226aa4f0",
                      "type": "block",
                      "field": "67acbb9fa236bc7147f233fc",
                      "displayType": "original",
                      "x": 0,
                      "y": 1476,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acbbc878b4faedd81ab69a",
                      "type": "block",
                      "field": "67acbbbd531fd4a312c5e788",
                      "displayType": "original",
                      "x": 0,
                      "y": 1708,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acbc5dcc3e2888a4abcdb5",
                      "type": "block",
                      "field": "67acbbdf6f134fd4e7c1c100",
                      "displayType": "original",
                      "x": 0,
                      "y": 2004,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acbf5f66eff1baa6d5de74",
                      "type": "block",
                      "field": "67acbc6a1c0383c2479d28ea",
                      "displayType": "original",
                      "x": 0,
                      "y": 2108,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acbfa94a3d75ea58e75b8d",
                      "type": "block",
                      "field": "67acbfa48b37515886d8a70d",
                      "displayType": "original",
                      "x": 0,
                      "y": 2212,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acbffc0cf56b3163e8f70f",
                      "type": "block",
                      "field": "67acbffaa7d0a19e16793ed6",
                      "displayType": "original",
                      "x": 0,
                      "y": 2444,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc020ebdfbc311edf3b3f",
                      "type": "block",
                      "field": "67acc0120e7a0b3a37967572",
                      "displayType": "original",
                      "x": 0,
                      "y": 2740,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc07c47bd818acd6bb90a",
                      "type": "block",
                      "field": "67acc03ba8c9359a34248aa2",
                      "displayType": "original",
                      "x": 0,
                      "y": 2844,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc094f6e6d07d243800f8",
                      "type": "block",
                      "field": "67acc08c6688327a6f0b376d",
                      "displayType": "original",
                      "x": 0,
                      "y": 2948,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc0ae7b7700b655fd6d89",
                      "type": "block",
                      "field": "67acc0aa5c6af40af2fee218",
                      "displayType": "original",
                      "x": 0,
                      "y": 3180,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc0c9b4edb7708dc6d2be",
                      "type": "block",
                      "field": "67acc0bece7c63e94f81ea74",
                      "displayType": "original",
                      "x": 0,
                      "y": 3476,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc0ef5f31cad6164013b4",
                      "type": "block",
                      "field": "67acc0d9ed702015c19d4429",
                      "displayType": "original",
                      "x": 0,
                      "y": 3580,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc103cc88fa2e75d2973d",
                      "type": "block",
                      "field": "67acc0feae3457fe12508422",
                      "displayType": "original",
                      "x": 0,
                      "y": 3684,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc117a479d9f41c7e27b5",
                      "type": "block",
                      "field": "67acc1128f453b0e1d384d64",
                      "displayType": "original",
                      "x": 0,
                      "y": 3916,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc12db4efd0060726494e",
                      "type": "block",
                      "field": "67acc1279c67d102b3f8b18f",
                      "displayType": "original",
                      "x": 0,
                      "y": 4212,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc17f213a22deb8ddacef",
                      "type": "block",
                      "field": "67acc17c705a7cec6302eb2a",
                      "displayType": "original",
                      "x": 0,
                      "y": 4316,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc1a212840b98df6082f9",
                      "type": "block",
                      "field": "67acc18e04c167cc69a1b925",
                      "displayType": "original",
                      "x": 0,
                      "y": 4420,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc1b99de290b217256c4c",
                      "type": "block",
                      "field": "67acc1b45fd243c15eb115c4",
                      "displayType": "original",
                      "x": 0,
                      "y": 4652,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc1e34214621150b28785",
                      "type": "block",
                      "field": "67acc1d9c555e30fa2c6f641",
                      "displayType": "original",
                      "x": 0,
                      "y": 4948,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc1f8d0d57d2cc3412177",
                      "type": "block",
                      "field": "67acc1f6a2929f65cedc2d9e",
                      "displayType": "original",
                      "x": 0,
                      "y": 5052,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc20be5d64df827c6b42b",
                      "type": "block",
                      "field": "67acc206b23dd1590421de0e",
                      "displayType": "original",
                      "x": 0,
                      "y": 5156,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc223ba3453077b4b1803",
                      "type": "block",
                      "field": "67acc21afcd7b298468e661e",
                      "displayType": "original",
                      "x": 0,
                      "y": 5388,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc239768c35e3e11e2fbd",
                      "type": "block",
                      "field": "67acc23369b55da49e46700d",
                      "displayType": "original",
                      "x": 0,
                      "y": 5684,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc24bb404e0e9fad1c415",
                      "type": "block",
                      "field": "67acc248786cb6b4564cdd95",
                      "displayType": "original",
                      "x": 0,
                      "y": 5788,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc26a50fdde4f9c1bb3e2",
                      "type": "block",
                      "field": "67acc2589f95e9e165e77eef",
                      "displayType": "original",
                      "x": 0,
                      "y": 5892,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc28458e30a5bbb834980",
                      "type": "block",
                      "field": "67acc27dece3095c94cc6417",
                      "displayType": "original",
                      "x": 0,
                      "y": 6124,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc2a481047f67532368e4",
                      "type": "block",
                      "field": "67acc2961257b2f5de5d8652",
                      "displayType": "original",
                      "x": 0,
                      "y": 6420,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc2c11876c920aa24e6aa",
                      "type": "block",
                      "field": "67acc2b98f7e406a36a9df38",
                      "displayType": "original",
                      "x": 0,
                      "y": 6524,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc2d864a8632aa66a9260",
                      "type": "block",
                      "field": "67acc2d17c12bcf23e87050a",
                      "displayType": "original",
                      "x": 0,
                      "y": 6628,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc2ef21562398de5fa303",
                      "type": "block",
                      "field": "67acc2e97917517b6aab8142",
                      "displayType": "original",
                      "x": 0,
                      "y": 6860,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc33043804d6b365b1b80",
                      "type": "block",
                      "field": "67acc32d898a9936bebd0ad6",
                      "displayType": "original",
                      "x": 0,
                      "y": 7156,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc3431807506d37d401da",
                      "type": "block",
                      "field": "67acc340000378ff580dad09",
                      "displayType": "original",
                      "x": 0,
                      "y": 7260,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc35bb2b108db2a01fe94",
                      "type": "block",
                      "field": "67acc35564c56683fa0819b7",
                      "displayType": "original",
                      "x": 0,
                      "y": 7364,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc37fc21b7d70d9d561fa",
                      "type": "block",
                      "field": "67acc36d8791bdea46430b92",
                      "displayType": "original",
                      "x": 0,
                      "y": 7596,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acc3c11bf9a6bfbd3205d0",
                      "type": "block",
                      "field": "67acc3bdb72464a8109f7deb",
                      "displayType": "original",
                      "x": 0,
                      "y": 7892,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd31b0f6853a7ed30c519",
                      "type": "block",
                      "field": "67acd27abb75a199dfe93a94",
                      "displayType": "original",
                      "x": 0,
                      "y": 7996,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd33da13d9a0cccd93380",
                      "type": "block",
                      "field": "67acd33b4bc4c118d8a67e4c",
                      "displayType": "original",
                      "x": 0,
                      "y": 8100,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd354b5ab78e9e6bdbe16",
                      "type": "block",
                      "field": "67acd34dfa4aae0fd5d7188d",
                      "displayType": "original",
                      "x": 0,
                      "y": 8332,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd36d8a20a0a188cbaf86",
                      "type": "block",
                      "field": "67acd3674d466b281f920f7b",
                      "displayType": "original",
                      "x": 0,
                      "y": 8628,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd39919d5ed8bb9e9ed1c",
                      "type": "block",
                      "field": "67acd396aa7c7cf6442f1327",
                      "displayType": "original",
                      "x": 0,
                      "y": 8732,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd3aee5de787dcfa30e4e",
                      "type": "block",
                      "field": "67acd3aa14b79982764cd3b5",
                      "displayType": "original",
                      "x": 0,
                      "y": 8836,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67acd3c5a10b9bf903bbbec4",
                      "type": "block",
                      "field": "67acd3bed1637dfd3713ce45",
                      "displayType": "original",
                      "x": 0,
                      "y": 9068,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67adbcd1b3d7d4834396ab56",
                      "type": "block",
                      "field": "67adbcb9291e6311b6b86518",
                      "displayType": "original",
                      "x": 0,
                      "y": 9364,
                      "width": 1,
                      "height": 40,
                      "fontSize": 20,
                      "fontColor": "#ff0000",
                      "fontWeight": "bold"
                    },
                    {
                      "_id": "67adbe140dee7bb026f52645",
                      "type": "block",
                      "field": "67adbe086b97577873a0cf94",
                      "displayType": "original",
                      "x": 0,
                      "y": 10172,
                      "width": 1,
                      "height": 83,
                      "fontSize": 20,
                      "fontColor": "#ff0000",
                      "fontWeight": "bold"
                    },
                    {
                      "_id": "67ae0cf575b1857b5a78dfd9",
                      "type": "multiSelect",
                      "field": "67ae0ce08caaa22d8dffde57",
                      "displayType": "original",
                      "targetValue": "67adbcaff947589d15e41e0e",
                      "x": 0,
                      "y": 1126,
                      "width": 1,
                      "height": 142,
                      "titleFontSize": 16,
                      "titleFontColor": "#ff0000",
                      "fontWeight": "bold",
                      "fontSize": 14,
                      "titleFontWeight": "normal"
                    },
                    {
                      "_id": "67af14276196c1c59168a695",
                      "type": "block",
                      "field": "67af1421dd6cef2cc73b664f",
                      "displayType": "original",
                      "x": 0,
                      "y": 1268,
                      "width": 1,
                      "height": 40,
                      "fontSize": 16,
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67b74acaa44b0a3e625cbf31",
                      "type": "text",
                      "field": "67b74ac6873a4b4fd17a845b",
                      "displayType": "original",
                      "x": 0,
                      "y": 382,
                      "width": 1,
                      "height": 64
                    },
                    {
                      "_id": "67b74aeb96647840276bb7a0",
                      "type": "text",
                      "field": "67b74aea341d917ff4774c38",
                      "displayType": "original",
                      "x": 0,
                      "y": 318,
                      "width": 1,
                      "height": 64
                    },
                    {
                      "_id": "67b74ca9f30e10ff1cef33a1",
                      "type": "text",
                      "field": "67b74ca7f1eda67f8b7a278f",
                      "displayType": "original",
                      "x": 0,
                      "y": 254,
                      "width": 1,
                      "height": 64
                    },
                    {
                      "_id": "67b74cdfaeb5281bd154ba36",
                      "type": "text",
                      "field": "67b74cd8157a14704e1a7a73",
                      "displayType": "original",
                      "x": 0,
                      "y": 190,
                      "width": 1,
                      "height": 64
                    },
                    {
                      "_id": "67b74ce1e589a5909850c793",
                      "type": "text",
                      "field": "67b74ce08c45bbb71708ecdc",
                      "displayType": "original",
                      "x": 0,
                      "y": 62,
                      "width": 1,
                      "height": 64
                    },
                    {
                      "_id": "67b74ce4b2c56201486d8fb7",
                      "type": "text",
                      "field": "67b74ce26bb710a351db1025",
                      "displayType": "original",
                      "x": 0,
                      "y": 126,
                      "width": 1,
                      "height": 64
                    },
                    {
                      "_id": "67b845a2e156614f2bc82e9a",
                      "type": "block",
                      "field": "67b8458ee301d36186b2f533",
                      "displayType": "original",
                      "x": 0,
                      "y": 1086,
                      "width": 1,
                      "height": 40,
                      "fontColor": "#ff0000",
                      "fontSize": 20,
                      "fontWeight": "bold"
                    },
                    {
                      "_id": "67b88e1d59beb47ffd4563fc",
                      "type": "block",
                      "field": "67b88e035a4e9c07d226ce8b",
                      "displayType": "original",
                      "x": 0,
                      "y": 10295,
                      "width": 1,
                      "height": 40,
                      "fontSize": 20,
                      "fontWeight": "bold",
                      "fontColor": "#ff0000"
                    },
                    {
                      "_id": "67b88ea7e2252ac322928a32",
                      "type": "block",
                      "field": "67b88e9c06d421c797b8bb20",
                      "displayType": "original",
                      "borderColor": "transparent",
                      "backgroundColor": "transparent",
                      "x": 0,
                      "y": 10255,
                      "width": 1,
                      "height": 40
                    }
                  ],
                  "layout": "grid",
                  "presentation": "normal",
                  "backgroundImage": "",
                  "filePath": "",
                  "fileName": "",
                  "padding": 12
                }
              ],
              "pageOrder": [
                "66a378f25ac13524d00accf8"
              ]
            }
          ]
        }
      ],
      "fields": [
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a378fc71147ef4bf75011d",
          "type": "block",
          "title": "Display Text",
          "value": "Client name:",
          "identifier": "task_client_name"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b06d430d122d02152de0",
          "type": "block",
          "title": "Display Text",
          "value": "Installation address:",
          "identifier": "task_property_address_street"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b07f1c5861cee8dd234e",
          "type": "block",
          "title": "Display Text",
          "value": "Post code:",
          "identifier": "task_property_address_postal_code"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b133a7c86355f72863de",
          "type": "block",
          "title": "Display Text",
          "value": "Job number:",
          "identifier": "task_ref"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b144d7562a5f7732ccc7",
          "type": "block",
          "title": "Display Text",
          "value": "Date:",
          "identifier": "{now_date}"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b16118a3d1244dcce584",
          "type": "block",
          "title": "Display Text",
          "value": "Installer:",
          "identifier": "task_assigned_to"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b17595ab5806e714e50c",
          "type": "textarea",
          "title": "Notes:",
          "identifier": "field_66a3b17ba4884b5d5f36efc3",
          "value": ""
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b189a0c23aeaf39623d0",
          "type": "text",
          "title": "20M ohms resistance (61 devices per loop)",
          "identifier": "field_66a3b18e3a8c477cfa93457e",
          "required": false
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b20f1bfda2ea6bcc99bc",
          "type": "text",
          "title": "R1 \u2013 Phase / +ve",
          "identifier": "field_66a3b213288a660eb1596534",
          "required": false
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b22f6422516ee96e47ee",
          "type": "text",
          "title": "R2 \u2013 CPC",
          "identifier": "field_66a3b230d0ddf937792f619a",
          "required": false
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b24b9ecead71a0d140d9",
          "type": "text",
          "title": "RN \u2013 Neutral / -ve",
          "identifier": "field_66a3b24ed5e7b344bbad8f8e",
          "required": false
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b68601f83c2b5cab89e3",
          "type": "text",
          "title": "Quiescent MA 1",
          "identifier": "field_66a3b6b59e8fb0c1e2cfc10a",
          "required": false
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b6ed5528c88ed2ae7db6",
          "type": "text",
          "title": "Quiescent MA 2",
          "identifier": "field_66a3b6f0b52dc539168d0f43"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b710e2de6fa2e5955157",
          "type": "text",
          "title": "Quiescent MA 3",
          "identifier": "field_66a3b7150d80b9f8b29ebce3"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3b7456d3a13d8d5ab278c",
          "type": "text",
          "title": "Quiescent MA 4",
          "identifier": "field_66a3b74975f3dceb4e76c38e"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bb19026b757d29ecd0dd",
          "type": "text",
          "title": "Full Load MA 1",
          "identifier": "field_66a3bb22a35a8a271bddfc91"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bb4530db720d47dfd8ae",
          "type": "text",
          "title": "Full Load MA 2",
          "identifier": "field_66a3bb4b137c80a8d614b4bb"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bb613a4b62dc8062c6f0",
          "type": "text",
          "title": "Full Load MA 3",
          "identifier": "field_66a3bb63026313d3362502aa"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bb777242ecd251a13237",
          "type": "text",
          "title": "Full Load MA 4",
          "identifier": "field_66a3bb7aa489a02577fc6131"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bb8bcf05747ec70efe47",
          "type": "text",
          "title": "Battery size Cmin (Calculated)",
          "identifier": "field_66a3bba4ded9f8c19c7e8927"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bbcb6676fb9d1ae1b444",
          "type": "text",
          "title": "Battery size Cmin (Required)",
          "identifier": "field_66a3bbcf518680849c9fdc51"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bbea2c37faaf8fc0d9e3",
          "type": "text",
          "title": "Battery size Cmin (Fitted)",
          "identifier": "field_66a3bbecff54d5aafd0b9f7b"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "66a3bc0ac242e3e1de6a87c6",
          "type": "text",
          "title": "Battery size Cmin (Dated)",
          "identifier": "field_66a3bc0dfce2afb8c9c34c93"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f5f6e8a3cf33d9b13fa2",
          "type": "text",
          "title": "Loop/Radial 1",
          "identifier": "field_67a5f60277b8b219b3b31d09",
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              }
            ]
          },
          "hidden": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f60f496cbf96408ac6c9",
          "type": "text",
          "title": "Loop/Radial 2",
          "identifier": "field_67a5f61321987bddbc397d1d",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60036781e672996fccfe1",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f61df6dcc261a1a49ed5",
          "type": "text",
          "title": "Loop/Radial 3",
          "identifier": "field_67a5f61e2b0e028695bd5c62",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60047f621cb47d4756a73",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f62a07c2952485a8703c",
          "type": "text",
          "title": "Loop/Radial 4",
          "identifier": "field_67a5f645817d68ac1aa4fce2",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60058175fbab893fc0c66",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f689e5bd6e1c4f3c8a63",
          "type": "text",
          "title": "Loop/Radial 5",
          "identifier": "field_67a5f68c5c46254427326ebd",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6006bb02c2cfede01de20",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f69af34263576bdf6c54",
          "type": "text",
          "title": "Loop/Radial 6",
          "identifier": "field_67a5f69c56194b1b504ac2a0",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6007c6aad66526f9a1c9e",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6ab5298abb2641a2fec",
          "type": "text",
          "title": "Loop/Radial 7",
          "identifier": "field_67a5f6adbbb95a0fd4d32308",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60090249a577859e0ee67",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6ba30228348256cbd18",
          "type": "text",
          "title": "Addressable Sounder Cct 1",
          "identifier": "field_67a5f6bc685e34cbc2605a22",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6c92b37182572a89d90",
          "type": "text",
          "title": "Addressable Sounder Cct 2",
          "identifier": "field_67a5f6cc426d8377ec4a9d75",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600c33623023a630bc21c",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6d77749beef9ed7cb50",
          "type": "text",
          "title": "Addressable Sounder Cct 3",
          "identifier": "field_67a5f6dac1f8eff3e2e42533",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600d346a564f0cc813173",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6e3c6217370906f1c5c",
          "type": "text",
          "title": "Addressable Sounder Cct 4",
          "identifier": "field_67a5f6e58abcee1cb4f8bde9",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a601ecb4a9140acf57f625",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6efe2162cc469f356dc",
          "type": "text",
          "title": "Zone/Radial 1",
          "identifier": "field_67a5f6f307620dca40c46adc",
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              }
            ]
          },
          "hidden": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f6fda0fc2ca643b9f720",
          "type": "text",
          "title": "Zone/Radial 2",
          "identifier": "field_67a5f6ff08072015b689ef3d",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60036781e672996fccfe1",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f70a94672d8fe81ef83e",
          "type": "text",
          "title": "Zone/Radial 3",
          "identifier": "field_67a5f70c6f5650469d4cd1ce",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60047f621cb47d4756a73",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f727ab7920ae0d1c7233",
          "type": "text",
          "title": "Zone/Radial 4",
          "identifier": "field_67a5f72a892b3b481c44aa56",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60058175fbab893fc0c66",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f7383392cda4a440755d",
          "type": "text",
          "title": "Zone/Radial 5",
          "identifier": "field_67a5f73a99ff0c2ba2f7bdb2",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6006bb02c2cfede01de20",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f746417f3fffac394253",
          "type": "text",
          "title": "Zone/Radial 6",
          "identifier": "field_67a5f7492c4f82323eafcd6c",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6007c6aad66526f9a1c9e",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f75a009533a5686ef2ae",
          "type": "text",
          "title": "Zone/Radial 7",
          "identifier": "field_67a5f75c11458748cd0c6d15",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60090249a577859e0ee67",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f768dce57d63a8705a43",
          "type": "text",
          "title": "Conventional Sounder Cct 1",
          "identifier": "field_67a5f77762c2e47da85dd564",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f7813441e22497063e32",
          "type": "text",
          "title": "Conventional Sounder Cct 2",
          "identifier": "field_67a5f783cb5d9674587176e3",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600c33623023a630bc21c",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f7c06ed33fa11d16059c",
          "type": "text",
          "title": "Conventional Sounder Cct 3",
          "identifier": "field_67a5f7c560d1923c0f1a765a",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600d346a564f0cc813173",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f7d26579d7f1b1f1f83f",
          "type": "text",
          "title": "Conventional Sounder Cct 4",
          "identifier": "field_67a5f7d56c23573487a6df54",
          "hidden": true,
          "logic": {
            "action": "show",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67ae0ce08caaa22d8dffde57",
                "condition": "=",
                "value": "67adbcaf7617b1b23fb7f761"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a601ecb4a9140acf57f625",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f7e0d82874fc8e3dc783",
          "type": "text",
          "title": "Positive (R1) 1",
          "identifier": "field_67a5f7f72e925066a002c23c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f805b9cd00906c1341a8",
          "type": "text",
          "title": "Positive (R1) 2",
          "identifier": "field_67a5f807c8cf0d16911cf6a2",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60036781e672996fccfe1",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f81f6cbde9475554dd04",
          "type": "text",
          "title": "Positive (R1) 3",
          "identifier": "field_67a5f821671bb3ce7c3050df",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60047f621cb47d4756a73",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f830cea9d8618ccb4fca",
          "type": "text",
          "title": "Positive (R1) 4",
          "identifier": "field_67a5f83588024dcfbd08ec02",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60058175fbab893fc0c66",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f85098be3fb3845ea2de",
          "type": "text",
          "title": "Positive (R1) 5",
          "identifier": "field_67a5f85163c0f991ca6c76f8",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6006bb02c2cfede01de20",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f85cda4c5790795ff55e",
          "type": "text",
          "title": "Positive (R1) 6",
          "identifier": "field_67a5f85e5eddfffecd70ba18",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6007c6aad66526f9a1c9e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f869c90e50fbb2ee0ced",
          "type": "text",
          "title": "Positive (R1) 7",
          "identifier": "field_67a5f86ad72e44a83c9142c9",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60090249a577859e0ee67",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f874df6721b697c3cda4",
          "type": "text",
          "title": "Positive (R1) 1",
          "identifier": "field_67a5f8836b313538d400bad5",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f88f90dbff0a2996b848",
          "type": "text",
          "title": "Positive (R1) 2",
          "identifier": "field_67a5f891da098a1c56a9c7e1",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600c33623023a630bc21c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f89c04e04ce12c575047",
          "type": "text",
          "title": "Positive (R1) 3",
          "identifier": "field_67a5f89ecace838fcb0c22b6",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600d346a564f0cc813173",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8adb1180e668b118abb",
          "type": "text",
          "title": "Positive (R1) 4",
          "identifier": "field_67a5f8afd2fcd7915537f78e",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a601ecb4a9140acf57f625",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8b83de7eaaf48f2151b",
          "type": "text",
          "title": "Negative (RN) 1",
          "identifier": "field_67a5f8ba36ad1eff1af1d730",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8c5395a4131f11dbac3",
          "type": "text",
          "title": "Negative (RN) 2",
          "identifier": "field_67a5f8c7081f0a783040e35e",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8d15910c207fd0dac2e",
          "type": "text",
          "title": "Negative (RN) 3",
          "identifier": "field_67a5f8d24b990a7fa148a3cb",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8dc89c8792b15650974",
          "type": "text",
          "title": "Negative (RN) 4",
          "identifier": "field_67a5f8df1f7915f47e2ec58c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8e9d877972420dcd091",
          "type": "text",
          "title": "Negative (RN) 5",
          "identifier": "field_67a5f8eb6a96483c3d3e8ac8",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f8f5dfe11880af9f07a5",
          "type": "text",
          "title": "Negative (RN) 6",
          "identifier": "field_67a5f8f7d63f0720e47750c4",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f900b878509bc70ffc26",
          "type": "text",
          "title": "Negative (RN) 7",
          "identifier": "field_67a5f914f6368894c4ec873b",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f932f6c69486a8fb05cd",
          "type": "text",
          "title": "Negative (RN) 1",
          "identifier": "field_67a5f934a15685672ed8983f",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f9419e5f2a19fea462a9",
          "type": "text",
          "title": "Negative (RN) 2",
          "identifier": "field_67a5f943f9f4d2141d21d647",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f952cd40f1b442fbd2b5",
          "type": "text",
          "title": "Negative (RN) 3",
          "identifier": "field_67a5f9542cba66a949a5dda0",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5f961bfc7ac85fea477e6",
          "type": "text",
          "title": "Negative (RN) 4",
          "identifier": "field_67a5fa2cbeecbdb06b708377",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fa376b780a123bf235c6",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 1",
          "identifier": "field_67a5fa3918e5eb5f92e3aed8",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fa469559cf442ab05172",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 2",
          "identifier": "field_67a5fa49960023f6f50dd280",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fa540df72bcd6588657f",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 3",
          "identifier": "field_67a5fa560f3991ee7f136fcb",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fa6194a981bf5fdb651f",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 4",
          "identifier": "field_67a5fa63a9312c69ce8669cc",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fa726c8fd818f2a1ec62",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 5",
          "identifier": "field_67a5fa7614768b80d55d7b7f",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fa888db2d1b4671b1d5e",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 6",
          "identifier": "field_67a5fa97320bf8f146be8349",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5faa65b657eeca8d4aeec",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 7",
          "identifier": "field_67a5faa886cf1f19fc842b52",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fab8e55aa607873d5011",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 1",
          "identifier": "field_67a5fabc616a0883ef4e5efb",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fac97ea6b5f44fc1c06b",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 2",
          "identifier": "field_67a5facc49ebd15e54699f6c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fad804c5a4fb1156f845",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 3",
          "identifier": "field_67a5fadb20776c975fefc668",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fae9ce3d10bf6eee3c71",
          "type": "text",
          "title": "CPC \"Screen\" (R2) 4",
          "identifier": "field_67a5faeb90b350c9c96ff572",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fafb6c9a859024a26338",
          "type": "text",
          "title": "Positive to Earth (M ohms) 1",
          "identifier": "field_67a5fb47908735e5e78541e8",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fb5497ecd36c47955e33",
          "type": "text",
          "title": "Positive to Earth (M ohms) 2",
          "identifier": "field_67a5fb56b859963df933830d",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fb607d5b86df72219995",
          "type": "text",
          "title": "Positive to Earth (M ohms) 3",
          "identifier": "field_67a5fb623f2a5dbed9e795d2",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fb6e9df881346e22f3ed",
          "type": "text",
          "title": "Positive to Earth (M ohms) 4",
          "identifier": "field_67a5fb71baf9690616f582ea",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fb8015fec7b6d407d8c7",
          "type": "text",
          "title": "Positive to Earth (M ohms) 5",
          "identifier": "field_67a5fb82075defa1acf941f0",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fb8ca4a457ffef073c6c",
          "type": "text",
          "title": "Positive to Earth (M ohms) 6",
          "identifier": "field_67a5fb8ff9ba00e5ef9056cb",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fb9f095ada06b46df85a",
          "type": "text",
          "title": "Positive to Earth (M ohms) 7",
          "identifier": "field_67a5fba1cba46a1be04d549f",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fbb04339a4c663ba6975",
          "type": "text",
          "title": "Positive to Earth (M ohms) 1",
          "identifier": "field_67a5fbb26d78e30c9830653b",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fbc1dbf3e0304491ca6c",
          "type": "text",
          "title": "Positive to Earth (M ohms) 2",
          "identifier": "field_67a5fbdfcd0fb9ee49bd4693",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fbecac943aeada3801e0",
          "type": "text",
          "title": "Positive to Earth (M ohms) 3",
          "identifier": "field_67a5fbee85914ee1af792e4c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fc2c06793cc8024df0ff",
          "type": "text",
          "title": "Positive to Earth (M ohms) 4",
          "identifier": "field_67a5fc2f51d4d6703d7a854c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fc5aebce7bf097e6f273",
          "type": "text",
          "title": "Negative to Earth (M ohms) 1",
          "identifier": "field_67a5fd3ffb61d3e32b5ebdea",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fd4ed681b8a0814a63cf",
          "type": "text",
          "title": "Negative to Earth (M ohms) 2",
          "identifier": "field_67a5fd53e9950651148a3083",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fd5e1145494b319c102c",
          "type": "text",
          "title": "Negative to Earth (M ohms) 3",
          "identifier": "field_67a5ff649df540a588464865",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ff822ee8274d2ecbdc59",
          "type": "text",
          "title": "Negative to Earth (M ohms) 4",
          "identifier": "field_67a5ff84dd7fad0b6b44429f",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ff8ebd34f3f827057e5f",
          "type": "text",
          "title": "Negative to Earth (M ohms) 5",
          "identifier": "field_67a5ff90c9bb5d18042fcb43",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ff9c90c1e94d49764a2e",
          "type": "text",
          "title": "Negative to Earth (M ohms) 6",
          "identifier": "field_67a5ff9ea983c36977e07d69",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ffab700501d542d06aec",
          "type": "text",
          "title": "Negative to Earth (M ohms) 7",
          "identifier": "field_67a5ffb41b58d16c1369d1e6",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ffc205ef34a5c938254c",
          "type": "text",
          "title": "Negative to Earth (M ohms) 1",
          "identifier": "field_67a5ffc4d9753ffaa867daa0",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ffd37a1222eee318b8e5",
          "type": "text",
          "title": "Negative to Earth (M ohms) 2",
          "identifier": "field_67a5ffd57b2ed3ffe72ddb88",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5ffe56b8f3a2a6784689d",
          "type": "text",
          "title": "Negative to Earth (M ohms) 3",
          "identifier": "field_67a5ffe78897627d24a47250",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a5fff5689aedb8122b3251",
          "type": "text",
          "title": "Negative to Earth (M ohms) 4",
          "identifier": "field_67a5fff87228a68f1e05d4a4",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60036781e672996fccfe1",
          "type": "text",
          "title": "Positive to Negative (M ohms) 1",
          "identifier": "field_67a60039dd57f62e21f2adf4",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60047f621cb47d4756a73",
          "type": "text",
          "title": "Positive to Negative (M ohms) 2",
          "identifier": "field_67a6004a48df4127a93904b1",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60058175fbab893fc0c66",
          "type": "text",
          "title": "Positive to Negative (M ohms) 3",
          "identifier": "field_67a6005ad8e0126dc1263a1f",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6006bb02c2cfede01de20",
          "type": "text",
          "title": "Positive to Negative (M ohms) 4",
          "identifier": "field_67a6006d26a0c9f899399a95",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6007c6aad66526f9a1c9e",
          "type": "text",
          "title": "Positive to Negative (M ohms) 5",
          "identifier": "field_67a6007f9115f64a71ada9f4",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60090249a577859e0ee67",
          "type": "text",
          "title": "Positive to Negative (M ohms) 6",
          "identifier": "field_67a6009cc5a9b30bede32f40",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a600a955b4afd5cdf6a481",
          "type": "text",
          "title": "Positive to Negative (M ohms) 7",
          "identifier": "field_67a600ab262a04f79feb9d14",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a600c33623023a630bc21c",
          "type": "text",
          "title": "Positive to Negative (M ohms) 1",
          "identifier": "field_67a600c544e2beb04f828f1e",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a600d346a564f0cc813173",
          "type": "text",
          "title": "Positive to Negative (M ohms) 2",
          "identifier": "field_67a601e0db7fb2412971d2af",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a601ecb4a9140acf57f625",
          "type": "text",
          "title": "Positive to Negative (M ohms) 3",
          "identifier": "field_67a601ef824bd2be657ee5fc",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6020f5d884786e0628949",
          "type": "text",
          "title": "Positive to Negative (M ohms) 4",
          "identifier": "field_67a60211fa646ce25ec6c510",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6023f6f13054216caf82e",
          "type": "text",
          "title": "Cable Type & Size 1",
          "identifier": "field_67a6024580f254aee0e31759",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a602523d2cc9cf7d1d250b",
          "type": "text",
          "title": "Cable Type & Size 2",
          "identifier": "field_67a60254387862b3f0c2886b",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60261fc53b3406b7dd6bc",
          "type": "text",
          "title": "Cable Type & Size 3",
          "identifier": "field_67a602bc317b27e4e1da7a2e",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a602d8f51659162bc8118c",
          "type": "text",
          "title": "Cable Type & Size 4",
          "identifier": "field_67a602db809aa2c21b67f389",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a602ed0579f6789600b08a",
          "type": "text",
          "title": "Cable Type & Size 5",
          "identifier": "field_67a602efe17539de348e84bf",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a602fe19217176a9aa90a9",
          "type": "text",
          "title": "Cable Type & Size 6",
          "identifier": "field_67a6030195bff8d641762d14",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a603112204d5f29769d0e7",
          "type": "text",
          "title": "Cable Type & Size 7",
          "identifier": "field_67a6031395aaa0eaa57aaca5",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6032a0054be0232d7951b",
          "type": "text",
          "title": "Cable Type & Size 1",
          "identifier": "field_67a6032dc6ad04df75ec39ea",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6033cb233d9c220322364",
          "type": "text",
          "title": "Cable Type & Size 2",
          "identifier": "field_67a6033eee67d0b0323c6c3c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6034d049b8364159f1839",
          "type": "text",
          "title": "Cable Type & Size 3",
          "identifier": "field_67a6034fa3437623f78b3ab2",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6035be5dedf7298daa33b",
          "type": "text",
          "title": "Cable Type & Size 4",
          "identifier": "field_67a6035dd00786a30c0226a9",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6036a3e10b9e438c9f108",
          "type": "text",
          "title": "Type 1",
          "identifier": "field_67a6036d09b63db21c0fc569"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60379f53122fe9da96aeb",
          "type": "text",
          "title": "Serial Number 1",
          "identifier": "field_67a6037bc160691057fdee5e"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a60385067dfe9560697bb1",
          "type": "text",
          "title": "Calibration Date 1",
          "identifier": "field_67a6038871df540391556f29"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6039167d791ca40b57624",
          "type": "text",
          "title": "Type 2",
          "identifier": "field_67a6039316774ec2d1df3ce4"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a6039e3da2d4607be3bfa2",
          "type": "text",
          "title": "Serial Number 2",
          "identifier": "field_67a603a15a26c166bfae2ec7"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67a603b05f0fbc345f38ca94",
          "type": "text",
          "title": "Calibration Date 2",
          "identifier": "field_67a619ac5fe071aff6ba8e11"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67ac76fdcdf221789575314c",
          "type": "multiSelect",
          "title": "Yes:",
          "options": [
            {
              "_id": "67ac6a6b835b150c0b965b97",
              "value": "Select to tick",
              "deleted": false
            }
          ],
          "identifier": "field_67ac76ff16e6bdfda1521b16"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67ac77230af8f7532ad28ea3",
          "type": "multiSelect",
          "title": "No:",
          "options": [
            {
              "_id": "67ac6a6b835b150c0b965b97",
              "value": "Select to tick",
              "deleted": false
            }
          ],
          "identifier": "field_67ac772939c74fca7f1728f8"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acaf918f62117488eed759",
          "type": "block",
          "title": "Display Text",
          "value": "FIRE DETECTION & ALARM SYSTEMS - FIXED WIRE CHECKS",
          "identifier": "field_67acaf9531c36f64ea0cf5cb"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acaff9699047329cd8fda8",
          "type": "block",
          "title": "Display Text",
          "value": "Cable Routes Marked on Drawing:",
          "identifier": "field_67acaffe6abaf7c9db70193d"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbb833449e6dfa73b542f",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acbb89717adbc77c608a70",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "66a3b24b9ecead71a0d140d9",
                "condition": "*=",
                "value": ""
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "66a3b24b9ecead71a0d140d9",
                "condition": "null=",
                "value": "67adbcaff947589d15e41e0e"
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbb9fa236bc7147f233fc",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acbba73dcb07c970001135",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbbbd531fd4a312c5e788",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acbbc8e6e45c081f0f7c3e",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f5f6e8a3cf33d9b13fa2",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6efe2162cc469f356dc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbbdf6f134fd4e7c1c100",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acbc5d7091f952b849dcbc",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6023f6f13054216caf82e",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6023f6f13054216caf82e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbc6a1c0383c2479d28ea",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acbf5f2e4c8ac3ab7119f9",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6023f6f13054216caf82e",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6023f6f13054216caf82e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbfa48b37515886d8a70d",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acbfa970d5b045faad0bce",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60036781e672996fccfe1",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acbffaa7d0a19e16793ed6",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acbffcee4c871ddc41b436",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f60f496cbf96408ac6c9",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6fda0fc2ca643b9f720",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc0120e7a0b3a37967572",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc0205ef54d6424c3f0d1",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602523d2cc9cf7d1d250b",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602523d2cc9cf7d1d250b",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc03ba8c9359a34248aa2",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc07c91990a3a1009c5b7",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602523d2cc9cf7d1d250b",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602523d2cc9cf7d1d250b",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc08c6688327a6f0b376d",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acc094499a10d1066fd083",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60047f621cb47d4756a73",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc0aa5c6af40af2fee218",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acc0ae0ac1d386780abb8f",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f61df6dcc261a1a49ed5",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f70a94672d8fe81ef83e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc0bece7c63e94f81ea74",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc0c95d36a06f033998cc",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60261fc53b3406b7dd6bc",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60261fc53b3406b7dd6bc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc0d9ed702015c19d4429",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc0ef3f2feecf4068a157",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60261fc53b3406b7dd6bc",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60261fc53b3406b7dd6bc",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc0feae3457fe12508422",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acc10322e0b12705aa0c50",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60058175fbab893fc0c66",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc1128f453b0e1d384d64",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acc117bf931f0c834b6136",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f62a07c2952485a8703c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f727ab7920ae0d1c7233",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc1279c67d102b3f8b18f",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc12da16b5a8a42cd54ac",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602d8f51659162bc8118c",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602d8f51659162bc8118c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc17c705a7cec6302eb2a",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc17f3473789bed25fb98",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602d8f51659162bc8118c",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602d8f51659162bc8118c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc18e04c167cc69a1b925",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acc1a26ecae4b284c9eda1",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6006bb02c2cfede01de20",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc1b45fd243c15eb115c4",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acc1b93a420157f1ef3e29",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f689e5bd6e1c4f3c8a63",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7383392cda4a440755d",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc1d9c555e30fa2c6f641",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc1e3b700a5511c3d5e3b",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602ed0579f6789600b08a",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602ed0579f6789600b08a",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc1f6a2929f65cedc2d9e",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc1f8748821e5b71abb4c",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602ed0579f6789600b08a",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602ed0579f6789600b08a",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc206b23dd1590421de0e",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acc20bf14cc940af69397c",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6007c6aad66526f9a1c9e",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc21afcd7b298468e661e",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acc223b2d402762ea47c8d",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f69af34263576bdf6c54",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f746417f3fffac394253",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc23369b55da49e46700d",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc239261c62458f84774e",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602fe19217176a9aa90a9",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602fe19217176a9aa90a9",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc248786cb6b4564cdd95",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc24bf2d1b737ec75be57",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602fe19217176a9aa90a9",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a602fe19217176a9aa90a9",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc2589f95e9e165e77eef",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuit Resistance",
          "identifier": "field_67acc26a702961a184befd74",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a60090249a577859e0ee67",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc27dece3095c94cc6417",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Insulation Resistance",
          "identifier": "field_67acc284e50a2703827128bd",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ab5298abb2641a2fec",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f75a009533a5686ef2ae",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc2961257b2f5de5d8652",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc2a452f7004afb153f66",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a603112204d5f29769d0e7",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a603112204d5f29769d0e7",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc2b98f7e406a36a9df38",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc2c1fe227f833425262f",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a603112204d5f29769d0e7",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a603112204d5f29769d0e7",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc2d17c12bcf23e87050a",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Circuit Resistance",
          "identifier": "field_67acc2d8c4ef7ed82d307baf",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc2e97917517b6aab8142",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Insulation Resistance",
          "identifier": "field_67acc2ef48510823811575bc",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6ba30228348256cbd18",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f768dce57d63a8705a43",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc32d898a9936bebd0ad6",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc330e84e921aa9dc0353",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6032a0054be0232d7951b",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6032a0054be0232d7951b",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc340000378ff580dad09",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acc34372cd02c94dbbffce",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6032a0054be0232d7951b",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6032a0054be0232d7951b",
                "condition": "*="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc35564c56683fa0819b7",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Circuit Resistance",
          "identifier": "field_67acc35bd1336422c316cbf1",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600c33623023a630bc21c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc36d8791bdea46430b92",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Insulation Resistance",
          "identifier": "field_67acc37f9d8bc56a6f97920a",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6c92b37182572a89d90",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7813441e22497063e32",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acc3bdb72464a8109f7deb",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acc3c12b1e5853902d6b6b",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6033cb233d9c220322364",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6033cb233d9c220322364",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd27abb75a199dfe93a94",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acd31b92e827ad17f92173",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6033cb233d9c220322364",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6033cb233d9c220322364",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd33b4bc4c118d8a67e4c",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Circuit Resistance",
          "identifier": "field_67acd33dc840466f215d13f5",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a600d346a564f0cc813173",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd34dfa4aae0fd5d7188d",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Insulation Resistance",
          "identifier": "field_67acd354df4797aa97503874",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6d77749beef9ed7cb50",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7c06ed33fa11d16059c",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd3674d466b281f920f7b",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67acd36dd8638e3dd8e00b43",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6034d049b8364159f1839",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6034d049b8364159f1839",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd396aa7c7cf6442f1327",
          "type": "block",
          "title": "Display Text",
          "value": "Conventional Circuit",
          "identifier": "field_67acd3997e13833129b8e219",
          "hidden": false,
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6034d049b8364159f1839",
                "condition": "*="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a6034d049b8364159f1839",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd3aa14b79982764cd3b5",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Circuit Resistance",
          "identifier": "field_67acd3ae8d72628dec35a935",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a601ecb4a9140acf57f625",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67acd3bed1637dfd3713ce45",
          "type": "block",
          "title": "Display Text",
          "value": "Sounder Insulation Resistance",
          "identifier": "field_67acd3c5b6cdb3d16385cd63",
          "logic": {
            "action": "hide",
            "eval": "and",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f6e3c6217370906f1c5c",
                "condition": "null="
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "67a5f7d26579d7f1b1f1f83f",
                "condition": "null="
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67adbcb9291e6311b6b86518",
          "type": "block",
          "title": "Display Text",
          "value": "Battery Calculation",
          "identifier": "field_67adbcd10de2ecca54c8018d"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67adbe086b97577873a0cf94",
          "type": "block",
          "title": "Display Text",
          "value": "Ensure that both Circuit Resistance and Insulation Resistance readings are recorded",
          "identifier": "field_67adbe143cf60845ab349df5"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67ae0ce08caaa22d8dffde57",
          "type": "multiSelect",
          "title": "Circuit Type:",
          "multi": false,
          "options": [
            {
              "_id": "67adbcaff947589d15e41e0e",
              "value": "Addressable",
              "deleted": false
            },
            {
              "_id": "67adbcaf7617b1b23fb7f761",
              "value": "Conventional",
              "deleted": false
            },
            {
              "_id": "67adbcaf814110c9e3b86a63",
              "value": "Mixed",
              "deleted": true
            }
          ],
          "identifier": "field_67ae0cf549a81bfc8885b5fe",
          "value": []
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67af1421dd6cef2cc73b664f",
          "type": "block",
          "title": "Display Text",
          "value": "Addressable Circuit",
          "identifier": "field_67af142727c5606ed4b9ceea",
          "logic": {
            "action": "hide",
            "eval": "or",
            "conditions": [
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "66a3b24b9ecead71a0d140d9",
                "condition": "null=",
                "value": "67adbcaff947589d15e41e0e"
              },
              {
                "file": "66a378f2c24a756b26ccd474",
                "page": "66a378f25ac13524d00accf8",
                "field": "66a3b24b9ecead71a0d140d9",
                "condition": "*=",
                "value": "67adbcaf814110c9e3b86a63"
              }
            ]
          }
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b74ac6873a4b4fd17a845b",
          "type": "text",
          "title": "Installer:",
          "identifier": "field_67b74aca72fac211f91cd71d",
          "disabled": false,
          "required": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b74aea341d917ff4774c38",
          "type": "text",
          "title": "Date:",
          "identifier": "{now_date}",
          "disabled": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b74ca7f1eda67f8b7a278f",
          "type": "text",
          "title": "Job Number:",
          "identifier": "task_ref",
          "disabled": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b74cd8157a14704e1a7a73",
          "type": "text",
          "title": "Post code:",
          "identifier": "task_property_address_postal_code",
          "disabled": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b74ce08c45bbb71708ecdc",
          "type": "text",
          "title": "Client name:",
          "identifier": "task_client_name",
          "disabled": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b74ce26bb710a351db1025",
          "type": "text",
          "title": "Installation address:",
          "identifier": "task_property_address_street",
          "disabled": true
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b8458ee301d36186b2f533",
          "type": "block",
          "title": "Display Text",
          "value": "Detection Circuits",
          "identifier": "field_67b845a2b5f7b06937c29b17"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b88e035a4e9c07d226ce8b",
          "type": "block",
          "title": "Display Text",
          "value": "Test Equipment Used",
          "identifier": "field_67b88e1dd0f7725e9c84e747"
        },
        {
          "file": "66a378f2c24a756b26ccd474",
          "_id": "67b88e9c06d421c797b8bb20",
          "type": "block",
          "title": "Empty Space",
          "identifier": "field_67b88ea7bad197f0074cfe82"
        }
      ]
    }
""".trimIndent()