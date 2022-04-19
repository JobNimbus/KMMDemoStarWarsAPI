// swift-tools-version:5.5
import PackageDescription

let package = Package(
    name: "StarWarsAPI",
    platforms: [
        .iOS(.v15)
    ],
    products: [
        .library(
            name: "StarWarsAPI",
            targets: ["StarWarsAPI"]
        ),
    ],
    targets: [
        .binaryTarget(
            name: "StarWarsAPI",
            path: "./StarWarsAPI.xcframework"
        ),
    ]
)
